package revanee.scalapay.model.requests;

import lombok.Builder;
import lombok.Getter;

@Builder
public class VoidRequest {

  /**
   * Order Token
   */
  @Getter
  private String token;

}
