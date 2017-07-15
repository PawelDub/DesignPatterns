package strategy.order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pawel_D on 2017-06-19.
 */
public class Order {
    private static String orderNumber;
    private List<OrderItems> orderItems = new ArrayList<>();

    public Order(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Order() {
    }

    public String getOrderNumber() {

        return orderNumber;
    }

    public static void setOrderNumber(String orderNumber) {
        Order.orderNumber = orderNumber;
    }



    public List<OrderItems> getOrderItems() {
        return orderItems;
    }

    public void add(OrderItems orderItems){
        this.orderItems.add(orderItems);
    }


}
