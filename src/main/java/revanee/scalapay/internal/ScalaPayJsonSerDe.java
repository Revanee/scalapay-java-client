package revanee.scalapay.internal;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import revanee.scalapay.exceptions.DeserializationException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScalaPayJsonSerDe {

  // The serialization must
  // convert float to string
  // use ISO 8601 to convert LocalDateTime
  private final Gson gson = new Gson().newBuilder()
      .registerTypeAdapter(Float.class, (JsonSerializer<Float>)
          (floatNum, type, jsonSerializationContext) -> new JsonPrimitive(String.valueOf(floatNum)))
      .registerTypeAdapter(LocalDateTime.class, (JsonDeserializer<LocalDateTime>)
          (json, type, jsonDeserializationContext) ->
              LocalDateTime.parse(json.getAsString(),
                  DateTimeFormatter.ISO_DATE_TIME)
      )
      .create();

  public <T> String serialize(T data) {
    return gson.toJson(data);
  }

  public <T> T deserialize(String json, Class<T> type) throws DeserializationException {
    try {
      return gson.fromJson(json, type);
    } catch (JsonSyntaxException e) {
      throw new DeserializationException(json, e);
    }
  }

}
