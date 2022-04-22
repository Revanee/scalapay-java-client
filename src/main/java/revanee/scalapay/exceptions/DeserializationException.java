package revanee.scalapay.exceptions;

import lombok.Getter;

public class DeserializationException extends ScalaPayException {

  @Getter
  private final String json;

  public DeserializationException(String json, Throwable e) {
    super("Could not deserialize json", e);
    this.json = json;
  }
}
