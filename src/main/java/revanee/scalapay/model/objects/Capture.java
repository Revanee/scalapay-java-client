package revanee.scalapay.model.objects;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;

@Builder
public class Capture {

  /**
   * Total discount amount
   */
  @Getter
  Amount amount;

  /**
   * Date and time of the capture in ISO 8601 format.
   */
  LocalDateTime recordedAt;

}
