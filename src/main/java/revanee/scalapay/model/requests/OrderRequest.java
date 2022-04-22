package revanee.scalapay.model.requests;

import revanee.scalapay.model.objects.Address;
import revanee.scalapay.model.objects.Amount;
import revanee.scalapay.model.objects.Consumer;
import revanee.scalapay.model.objects.Discount;
import revanee.scalapay.model.objects.Item;
import revanee.scalapay.model.objects.Merchant;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Builder
@Getter
public class OrderRequest {

  /**
   * Total Amount of the order
   */
  @NonNull
  private final Amount totalAmount;

  /**
   * Consumer's data
   */
  @NonNull
  private final Consumer consumer;

  private final Address billing;
  @NonNull
  private final Address shipping;
  @NonNull
  private final List<Item> items;
  private final List<Discount> discounts;
  @NonNull
  private final Merchant merchant;
  private final String merchantReference;
  private final Amount shippingAmount;
  private final Amount taxAmount;

  /**
   * Optional
   */
  private final Integer orderExpiryMilliseconds;
}
