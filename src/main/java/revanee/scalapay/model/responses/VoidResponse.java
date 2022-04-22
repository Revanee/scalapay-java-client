package revanee.scalapay.model.responses;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class VoidResponse {

  /**
   * Scalapay order unique token.
   */
  private String token;

  /**
   * Merchant unique Scalapay reference.
   */
  private String merchantReference;

  /**
   * Date and time of the order to be voided in ISO 8601 format.
   */
  private LocalDateTime voidedAt;

}
