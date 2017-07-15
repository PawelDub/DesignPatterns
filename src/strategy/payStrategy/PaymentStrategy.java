package strategy.payStrategy;

import strategy.order.Order;

/**
 * Created by Pawel_D on 2017-06-19.
 */
public interface PaymentStrategy {
    void pay(Order order);
}
