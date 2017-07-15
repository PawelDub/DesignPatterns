package proxy;

import java.util.List;

/**
 * Created by Pawel_D on 2017-07-11.
 */
public interface OrderService {
    List<String> getOrderList();
    void modifyOrder(String orderID);
}
