package strategy.payStrategy;

import strategy.order.Order;

/**
 * Created by Pawel_D on 2017-06-20.
 */
public class CashPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(Order order) {
        System.out.println("Zapłacono gotównką");
    }
}
