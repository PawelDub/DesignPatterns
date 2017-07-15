package proxy;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Pawel_D on 2017-07-11.
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public List<String> getOrderList() {
        return Arrays.asList("Order 1", "Order 2", "Order 3");
    }

    @Override
    public void modifyOrder(String orderID) {
        System.out.println("Modyfikuj zamówienie od id = " + orderID);

    }
}
