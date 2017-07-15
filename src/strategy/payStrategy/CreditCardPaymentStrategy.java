package strategy.payStrategy;

import strategy.order.Order;

/**
 * Created by Pawel_D on 2017-06-19.
 */
public class CreditCardPaymentStrategy implements PaymentStrategy{

    @Override
    public void pay(Order order) {
        System.out.println("Pay by credit card");
    }
}
