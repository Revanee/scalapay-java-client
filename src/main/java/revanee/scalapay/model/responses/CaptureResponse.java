package revanee.scalapay.model.responses;

import revanee.scalapay.model.objects.Amount;
import revanee.scalapay.model.objects.OrderDetails;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CaptureResponse {

  /**
   * Scalapay order unique token.
   */
  String token;

  /**
   * Scalapay order status.
   */
  String status;

  /**
   * Total order amount.
   */
  Amount totalAmount;

  /**
   * Order payload
   */
  List<OrderDetails> orderDetailsObject;
}
