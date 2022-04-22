package revanee.scalapay.model.objects;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Builder
public class Consumer {

  /**
   * Consumer email
   */
  @Getter
  String email;

  /**
   *	Consumer email Surname
   */
  @Getter
  @NonNull
  String surname;

  /**
   * Consumer Name
   */
  @Getter
  @NonNull
  String givenNames;

  /**
   * Consumer phone number
   */
  @Getter
  String phoneNumber;

}
