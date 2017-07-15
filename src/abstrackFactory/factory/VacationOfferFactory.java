package abstrackFactory.factory;

import abstrackFactory.products.food.FoodOffer;
import abstrackFactory.products.holtel.Hotel;
import abstrackFactory.products.transport.Ticket;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public interface VacationOfferFactory {
    Hotel createHotel();
    FoodOffer createFoodOffer();
    Ticket prepareTicket();
}
