package strategy.priceStrategy;

import strategy.order.Order;
import strategy.order.OrderItems;
import strategy.service.OrderService;

/**
 * Created by Pawel_D on 2017-06-20.
 */
public class BulkPriceCalculationStrategy implements PriceCalculationStrategy {
//    private int discountPercentage;
//
//    public int getDiscountPercentage() {
//        return discountPercentage;
//    }

    @Override
    public double calculationFinalPrice(Order order) {
        double finalPrice = 0;
        for(OrderItems orderItems : order.getOrderItems()){
            if(orderItems.getQuantity() >= 3){
                System.out.println("dostajesz 5% rabatu na " + orderItems.getProductName());
                double discount = (orderItems.getPrice() * 5)/100;
                double priceAfterDiscount = orderItems.getPrice() - discount;
                finalPrice += priceAfterDiscount * orderItems.getQuantity();
            } else {
                System.out.println("nie ma rabatu na " + orderItems.getProductName());
                finalPrice += (orderItems.getPrice() * orderItems.getQuantity());
            }
        }
        return finalPrice;
    }
}

