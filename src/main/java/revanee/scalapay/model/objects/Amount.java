package revanee.scalapay.model.objects;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Builder
public class Amount {

  /**
   * The total value amount
   */
  @Getter
  @NonNull
  private Float	amount;

  /**
   * The currency of the amount
   */
  @Getter
  @NonNull
  private String currency;

}
