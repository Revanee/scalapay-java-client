package revanee.scalapay.model.responses;

import revanee.scalapay.model.objects.Amount;
import revanee.scalapay.model.objects.OrderDetails;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DelayResponse {

  /**
   * Scalapay order unique token.
   */
  String token;

  /**
   * Date and time of the authorization to expire in ISO 8601 format.
   */
  LocalDateTime authorizationExpiryAt;

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
