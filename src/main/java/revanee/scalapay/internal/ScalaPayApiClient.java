package revanee.scalapay.internal;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import revanee.scalapay.exceptions.ConnectionException;
import revanee.scalapay.exceptions.ScalaPayException;
import revanee.scalapay.exceptions.UnsuccessfulRequestException;
import java.io.IOException;

public class ScalaPayApiClient {

  private final String apiKey;
  private final String apiUrl;

  private final ScalaPayJsonSerDe serDe;

  OkHttpClient client = new OkHttpClient();

  public ScalaPayApiClient(String apiUrl, String apiKey) {
    this.apiUrl = apiUrl;
    this.apiKey = apiKey;
    this.serDe = new ScalaPayJsonSerDe();
  }

  public <T> Request createRequest(T requestData, String url, String apiKey) {
    String json = serDe.serialize(requestData);
    RequestBody requestBody = RequestBody
        .create(MediaType.parse("application/json"), json);

    return new Request.Builder()
        .url(url)
        .post(requestBody)
        .addHeader("Accept", "application/json")
        .addHeader("Content-Type", "application/json")
        .addHeader("Authorization", "Bearer " + apiKey)
        .build();
  }

  public <T, S> T makeRequest(S requestData, String path, Class<T> responseType)
      throws ScalaPayException {
    Request request = createRequest(requestData, apiUrl + path, apiKey);
    Response response;
    try {
      response = client.newCall(request).execute();
    } catch (IOException e) {
      throw new ConnectionException(e);
    }
    if (!response.isSuccessful()) {
      throw new UnsuccessfulRequestException(response);
    }
    try {
      return serDe.deserialize(response.body().string(), responseType);
    } catch (IOException e) {
      throw new ConnectionException("Could not read body of Response as String", e);
    }
  }


}
