package revanee.scalapay.exceptions;

import com.squareup.okhttp.Response;
import lombok.Getter;

public class UnsuccessfulRequestException extends ScalaPayException {

  @Getter
  private final Response response;

  public UnsuccessfulRequestException(Response response) {
    super("Request is not successful");
    this.response = response;
  }
}
