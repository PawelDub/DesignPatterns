package proxy;

import strategy.order.Order;

import java.util.List;

/**
 * Created by Pawel_D on 2017-07-11.
 */
public class ProxyOrderServiceImpl implements OrderService {
    private OrderService orderService;

    public ProxyOrderServiceImpl(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public List<String> getOrderList() {
        return orderService.getOrderList();
    }

    @Override
    public void modifyOrder(String orderID) {
        String userRole = LoginModule.getUserRole();
        if (userRole.equals("admin")) {
            orderService.modifyOrder(orderID);
        } else {
            System.out.println("User " + LoginModule.getUser() + " nie ma uprawnień  do modyfikacji");
        }
    }
}
