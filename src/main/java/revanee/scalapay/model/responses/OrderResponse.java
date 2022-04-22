package revanee.scalapay.model.responses;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class OrderResponse {

  /**
   * Scalapay order unique token.
   */
  private String token;

  /**
   * Date and time of the order to expire in ISO 8601 format.
   */
  private LocalDateTime expires;

  /**
   * Redirect Url to the Scalapay checkout.
   */
  private String checkoutUrl;
}
