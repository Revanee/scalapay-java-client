package revanee.scalapay.exceptions;

public class ScalaPayException extends Exception {

  public ScalaPayException(String message) {
    super(message);
  }

  public ScalaPayException(Throwable throwable) {
    super(throwable);
  }

  public ScalaPayException(String message, Throwable e) {
    super(message, e);
  }
}
