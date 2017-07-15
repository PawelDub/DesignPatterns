package strategy.transportStrategy;

import strategy.order.Order;

/**
 * Created by Pawel_D on 2017-06-24.
 */
public class PostTransportStrategy implements TransportStrategy {
    @Override
    public void transport(Order order) {
        System.out.println("Zamówienie nr " + order.getOrderNumber() + "wysłano Pocztą");
    }
}
