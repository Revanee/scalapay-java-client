package revanee.scalapay.model.objects;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Builder
public class Address {

  /**
   * Name
   */
  @Getter
  @NonNull
  String	name;

  /**
   * Address line
   */
  @Getter
  @NonNull
  String	line1;

  /**
   * City
   */
  @Getter
  String	suburb;

  /**
   * Geocode information. OPTIONAL
   */
  @Getter
  Geocode	geoCode;

  /**
   * Postcode
   */
  @Getter
  @NonNull
  String	postcode;

  /**
   * Country Code
   */
  @Getter
  @NonNull
  String	countryCode;

  /**
   * Phone Number
   */
  @Getter
  String	phoneNumber;
}
