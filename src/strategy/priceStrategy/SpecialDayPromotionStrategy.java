package strategy.priceStrategy;

import strategy.order.Order;
import strategy.order.OrderItems;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Pawel_D on 2017-06-24.
 */
public class SpecialDayPromotionStrategy implements PriceCalculationStrategy {
    private DayOfWeek dayOfWeek = DayOfWeek.from(LocalDate.now());
    private int dayDiscount = 0;

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public int getDayDiscount() {
        return dayDiscount;
    }

    public void setDayDiscount(int dayDiscount) {
        this.dayDiscount = dayDiscount;
    }

    @Override
    public double calculationFinalPrice(Order order) {
        currentDay();
        double finalPrice = 0;
        for (OrderItems orderItem : order.getOrderItems()) {
            finalPrice += (orderItem.getPrice() * orderItem.getQuantity());
        }
        double discount = (finalPrice * getDayDiscount()) / 100;
        double priceAfterDiscount = finalPrice - discount;
        System.out.println("Udzielamy " + getDayDiscount() + " % rabatu z okazji " + getDayOfWeek() + " SPECIAL DISCOUNT");
        return priceAfterDiscount;
    }

    private void currentDay() {
        String dayString = getDayOfWeek().toString().substring(0, 1);
        if (dayString.equals("S")) {
            setDayDiscount(10);
        } else {
            setDayDiscount(0);
        }
    }
}
