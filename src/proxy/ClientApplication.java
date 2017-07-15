package proxy;

import java.util.List;

/**
 * Created by Pawel_D on 2017-07-11.
 */
public class ClientApplication {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImpl();
        LoginModule.login("Ania");
        List<String> orderList = orderService.getOrderList();
        System.out.println("Order list:" + orderList);
        orderService.modifyOrder("2");

        LoginModule.login("Pawel");
        orderList = orderService.getOrderList();
        orderService.modifyOrder("2");
    }
}
