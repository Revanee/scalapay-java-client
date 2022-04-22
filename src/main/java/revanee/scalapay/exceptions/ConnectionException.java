package revanee.scalapay.exceptions;

public class ConnectionException extends ScalaPayException {
  public ConnectionException(Throwable t) {
    super(t);
  }

  public ConnectionException(String message, Throwable t) {
    super(message, t);
  }
}
