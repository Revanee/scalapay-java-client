package revanee.scalapay.model.objects;

import lombok.Builder;
import lombok.Getter;

@Builder
public class Geocode {

  /**
   * Unique identifier of the geographic entity
   */
  @Getter
  private String	place_id;

}
