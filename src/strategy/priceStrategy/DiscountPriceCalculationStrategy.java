package strategy.priceStrategy;

import strategy.order.Order;
import strategy.order.OrderItems;

/**
 * Created by Pawel_D on 2017-06-19.
 */
public class DiscountPriceCalculationStrategy implements PriceCalculationStrategy{

    private int discountPercentage;

    public DiscountPriceCalculationStrategy(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    @Override
    public double calculationFinalPrice(Order order) {
        double finalPrice = 0;
        for (OrderItems orderItem : order.getOrderItems()){
            double discount = (orderItem.getPrice() * getDiscountPercentage())/100;
            double priceAfterDiscount = orderItem.getPrice() - discount;
            finalPrice += priceAfterDiscount * orderItem.getQuantity();
        }
        System.out.println("Udzielamy " + discountPercentage + " % rabatu");
        return finalPrice;
    }
}
