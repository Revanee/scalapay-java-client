package revanee.scalapay.model.objects;

import lombok.Builder;
import lombok.Getter;

@Builder
public class Discount {

  /**
   * Total discount amount
   */
  @Getter
  Amount amount;

  /**
   * Discount description
   */
  @Getter
  String displayName;

}
