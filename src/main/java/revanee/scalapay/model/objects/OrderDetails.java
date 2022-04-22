package revanee.scalapay.model.objects;

import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Builder
public class OrderDetails {

  /**
   * Order items list. See Item
   */
  @Getter
  List<Item>	items;

  /**
   * Billing informations
   */
  @Getter
  Address	billing;

  /**
   * Consumer informations
   */
  @Getter
  Consumer	consumer;

  /**
   * Merchant urls informations
   */
  @Getter
  Merchant	merchant;

  /**
   * Shipping informations
   */
  @Getter
  Address	shipping;

  /**
   * Discount list. See Discount
   */
  @Getter
  List<Discount>	discounts;

  /**
   * Total tax amount
   */
  @Getter
  Amount	taxAmount;

  /**
   * Total order amount
   */
  @Getter
  Amount	totalAmount;

  /**
   * Total shipping amount
   */
  @Getter
  Amount	shippingAmount;

  /**
   * Unique reference that identifies merchant order
   */
  @Getter
  String	merchantReference;

  /**
   * Captures list. See Capture. OPTIONAL. Multicapture specific.
   */
  @Getter
  List<Capture> captures;

}
