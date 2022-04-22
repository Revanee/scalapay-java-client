package revanee.scalapay.model.objects;

import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Builder
public class Item {

  /**
   * Sku
   */
  @Getter
  @NonNull
  String sku;

  /**
   * Product serial number. OPTIONAL
   */
  @Getter
  String gtin;

  /**
   * Name
   */
  @Getter
  @NonNull
  String name;

  /**
   * Product brand name. OPTIONAL
   */
  @Getter
  String brand;

  /**
   * Product price
   */
  @Getter
  @NonNull
  Amount price;

  /**
   * Product main category. OPTIONAL
   */
  @Getter
  @NonNull
  String category;

  /**
   * Quantity
   */
  @Getter
  @NonNull
  Integer quantity;

  /**
   * Product subcategories. OPTIONAL
   */
  @Getter
  List<String> subcategory;

}
