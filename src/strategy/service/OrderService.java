package strategy.service;

import strategy.order.Order;
import strategy.payStrategy.CashPaymentStrategy;
import strategy.payStrategy.PaymentStrategy;
import strategy.priceStrategy.DefaultPriceCalculationStrategy;
import strategy.priceStrategy.PriceCalculationStrategy;
import strategy.transportStrategy.PostTransportStrategy;
import strategy.transportStrategy.TransportStrategy;

public class OrderService {
    private PaymentStrategy paymentStrategy = new CashPaymentStrategy();
    private PriceCalculationStrategy priceCalculationStrategy = new DefaultPriceCalculationStrategy();
    private TransportStrategy transportStrategy = new PostTransportStrategy();

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPriceCalculationStrategy(PriceCalculationStrategy priceCalculationStrategy) {
        this.priceCalculationStrategy = priceCalculationStrategy;
    }

    public void setTransportStrategy(TransportStrategy transportStrategy) {
        this.transportStrategy = transportStrategy;
    }

    public void processPayment(Order order){
        paymentStrategy.pay(order);
    }

    public double getFinalPrice(Order order){
        double calculationPrice = priceCalculationStrategy.calculationFinalPrice(order);
        System.out.println("Końcowa cena zamówienia wynosi " + calculationPrice);
        return  calculationPrice;
    }

    public void transportProces(Order order) {
        transportStrategy.transport(order);
    }
}