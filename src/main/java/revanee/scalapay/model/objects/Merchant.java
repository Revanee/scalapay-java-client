package revanee.scalapay.model.objects;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Builder
public class Merchant {

  /**
   * Merchant cancel url for failure
   */
  @Getter
  @NonNull
  String redirectCancelUrl;

  /**
   * Merchant cancel url for success
   */
  @Getter
  @NonNull
  String redirectConfirmUrl;

}
