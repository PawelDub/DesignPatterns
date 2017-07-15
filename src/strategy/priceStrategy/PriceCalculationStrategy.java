package strategy.priceStrategy;

import strategy.order.Order;

/**
 * Created by Pawel_D on 2017-06-19.
 */
public interface PriceCalculationStrategy {
    double calculationFinalPrice(Order order);
}
