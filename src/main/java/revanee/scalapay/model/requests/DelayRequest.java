package revanee.scalapay.model.requests;

import lombok.Builder;
import lombok.Getter;

@Builder
public class DelayRequest {

  /**
   * Length of time that the authorization is valid for
   */
  @Getter
  Integer authorizationExpiryMilliseconds;


  /**
   * Unique reference that identifies merchant
   */
  @Getter
  String merchantReference;

}
