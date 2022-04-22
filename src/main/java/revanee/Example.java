package revanee;

import java.util.List;
import java.util.Scanner;
import revanee.scalapay.ScalaPayConnector;
import revanee.scalapay.ScalaPayConstants;
import revanee.scalapay.exceptions.ScalaPayException;
import revanee.scalapay.model.objects.Address;
import revanee.scalapay.model.objects.Amount;
import revanee.scalapay.model.objects.Consumer;
import revanee.scalapay.model.objects.Item;
import revanee.scalapay.model.objects.Merchant;
import revanee.scalapay.model.requests.CaptureRequest;
import revanee.scalapay.model.requests.OrderRequest;
import revanee.scalapay.model.responses.CaptureResponse;
import revanee.scalapay.model.responses.OrderResponse;

public class Example {

  private static final OrderRequest testOrderRequest = OrderRequest.builder()
      .merchantReference("merchantOrder-1234")
      .totalAmount(Amount.builder()
          .amount(99.0f)
          .currency("EUR")
          .build())
      .consumer(Consumer.builder()
          .surname("Smith")
          .givenNames("John")
          .build())
      .shipping(Address.builder()
          .name("John Smith")
          .line1("Via Italia 1")
          .postcode("50056")
          .countryCode("IT")
          .build())
      .items(List.of(
          Item.builder()
              .sku("12341234")
              .name("T-Shirt")
              .price(Amount.builder()
                  .currency("EUR")
                  .amount(99.0f)
                  .build())
              .category("clothes")
              .quantity(1)
              .build()))
      .merchant(Merchant.builder()
          .redirectCancelUrl("https://portal.integration.scalapay.com/failure-url")
          .redirectConfirmUrl("https://portal.integration.scalapay.com/success-url")
          .build())
      .build();

  public static void main(String[] args) throws ScalaPayException {
    ScalaPayConnector connector = new ScalaPayConnector(ScalaPayConstants.SANDBOX_URL,
        ScalaPayConstants.SANDBOX_KEY);

    System.out.println("Creating test order...");
    OrderResponse orderResponse = connector.createOrder(testOrderRequest);

    System.out.println("Created test order!");
    System.out.println("The order token is " + orderResponse.getToken());
    System.out.println("Follow this link to approve the order: " + orderResponse.getCheckoutUrl());
    System.out.println("Then press Enter to continue with capture...");

    Scanner s = new Scanner(System.in);
    s.nextLine();

    CaptureResponse captureResponse = connector.capturePayment(CaptureRequest.builder()
        .merchantReference(testOrderRequest.getMerchantReference())
        .amount(testOrderRequest.getTotalAmount())
        .token(orderResponse.getToken())
        .build());

    System.out.println("Order payment captured successfully");
    System.out.println("Status is: " + captureResponse.getStatus());
  }
}
