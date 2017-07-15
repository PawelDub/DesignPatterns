package strategy.transportStrategy;

import strategy.order.Order;

/**
 * Created by Pawel_D on 2017-06-24.
 */
public interface TransportStrategy {
    void transport(Order order);
}
