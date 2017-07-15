package strategy.priceStrategy;

import strategy.order.Order;
import strategy.order.OrderItems;

/**
 * Created by Pawel_D on 2017-06-19.
 */
public class DefaultPriceCalculationStrategy implements PriceCalculationStrategy {
    @Override
    public double calculationFinalPrice(Order order) {
        double finalPrice = 0;
        for(OrderItems orderItem : order.getOrderItems() ) {
            finalPrice += (orderItem.getPrice() * orderItem.getQuantity());
        }
        return finalPrice;
    }
}
