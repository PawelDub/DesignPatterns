package strategy;

import strategy.order.Order;
import strategy.order.OrderItems;
import strategy.payStrategy.BankTransferPaymentStrategy;
import strategy.payStrategy.CashPaymentStrategy;
import strategy.payStrategy.CreditCardPaymentStrategy;
import strategy.priceStrategy.BulkPriceCalculationStrategy;
import strategy.priceStrategy.DefaultPriceCalculationStrategy;
import strategy.priceStrategy.DiscountPriceCalculationStrategy;
import strategy.priceStrategy.SpecialDayPromotionStrategy;
import strategy.service.OrderService;
import strategy.transportStrategy.InpostTransportStrategy;
import strategy.transportStrategy.PostTransportStrategy;
import strategy.transportStrategy.RuchTransportStrategy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class ClientApplication {

    public static void main(String[] args) {
        Order order = new Order("1/2017 ");
        order.add(new OrderItems("Iphone 7", 3, 300));
        order.add(new OrderItems("Ladowarka", 3, 100));

        OrderService orderService = new OrderService();
        orderService.setPriceCalculationStrategy(new DefaultPriceCalculationStrategy());
        orderService.setTransportStrategy(new PostTransportStrategy());
        orderService.getFinalPrice(order);
        orderService.processPayment(order);
        orderService.transportProces(order);

        System.out.println("--------------------------------------");

        orderService.setPaymentStrategy(new CreditCardPaymentStrategy());
        orderService.setPriceCalculationStrategy(new DiscountPriceCalculationStrategy(0));
        orderService.setTransportStrategy(new RuchTransportStrategy());
        orderService.getFinalPrice(order);
        orderService.processPayment(order);
        orderService.transportProces(order);

        System.out.println("--------------------------------------");
        orderService.setPaymentStrategy(new BankTransferPaymentStrategy());
        orderService.setPriceCalculationStrategy(new BulkPriceCalculationStrategy());
        orderService.setTransportStrategy(new InpostTransportStrategy());
        orderService.getFinalPrice(order);
        orderService.processPayment(order);
        orderService.transportProces(order);

        System.out.println("--------------------------------------");
        DayOfWeek dayOfWeek = DayOfWeek.from(LocalDate.now());
        System.out.println(dayOfWeek.toString().substring(0,1));
        System.out.println("--------------------------------------");

        orderService.setPaymentStrategy(new CashPaymentStrategy());
        orderService.setPriceCalculationStrategy(new SpecialDayPromotionStrategy());
        orderService.setTransportStrategy(new InpostTransportStrategy());
        orderService.getFinalPrice(order);
        orderService.processPayment(order);
        orderService.transportProces(order);


    }
}
