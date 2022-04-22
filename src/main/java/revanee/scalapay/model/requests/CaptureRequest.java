package revanee.scalapay.model.requests;

import revanee.scalapay.model.objects.Amount;
import lombok.Builder;

@Builder
public class CaptureRequest {

  private Amount amount;
  private String merchantReference;
  private String token;

}
