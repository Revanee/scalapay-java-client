package revanee.scalapay;

import revanee.scalapay.exceptions.ScalaPayException;
import revanee.scalapay.internal.ScalaPayApiClient;
import revanee.scalapay.model.requests.CaptureRequest;
import revanee.scalapay.model.requests.DelayRequest;
import revanee.scalapay.model.requests.OrderRequest;
import revanee.scalapay.model.requests.VoidRequest;
import revanee.scalapay.model.responses.CaptureResponse;
import revanee.scalapay.model.responses.DelayResponse;
import revanee.scalapay.model.responses.OrderResponse;
import revanee.scalapay.model.responses.VoidResponse;

public class ScalaPayConnector {

  private final ScalaPayApiClient apiClient;

  public ScalaPayConnector(String apiUrl, String apiKey) {
    this.apiClient = new ScalaPayApiClient(apiUrl, apiKey);
  }

  public OrderResponse createOrder(OrderRequest orderRequest) throws ScalaPayException {
    String orderPath = "/v2/orders";
    return apiClient.makeRequest(orderRequest, orderPath, OrderResponse.class);
  }

  public DelayResponse delayPayment(DelayRequest delayRequest, String token)
      throws ScalaPayException {
    String delayPath = "/v2/payments/" + token + "/delay";
    return apiClient.makeRequest(delayRequest, delayPath, DelayResponse.class);
  }

  public CaptureResponse capturePayment(CaptureRequest captureRequest)
      throws ScalaPayException {
    String capturePath = "/v2/payments/capture";
    return apiClient.makeRequest(captureRequest, capturePath, CaptureResponse.class);
  }

  public VoidResponse voidPayment(VoidRequest voidRequest) throws ScalaPayException {
    String voidPath = "/v2/payments/capture";
    return apiClient.makeRequest(voidRequest, voidPath, VoidResponse.class);
  }

}
