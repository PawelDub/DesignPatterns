package strategy.payStrategy;

import strategy.order.Order;

/**
 * Created by Pawel_D on 2017-06-19.
 */
public class BankTransferPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(Order order) {
        System.out.println("Pay by bank transfer");
    }
}
