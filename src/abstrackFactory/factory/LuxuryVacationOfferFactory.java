package abstrackFactory.factory;

import abstrackFactory.products.food.FoodOffer;
import abstrackFactory.products.food.PremiumFoodOffer;
import abstrackFactory.products.holtel.HiltonHotel;
import abstrackFactory.products.holtel.Hotel;
import abstrackFactory.products.transport.FlyTicket;
import abstrackFactory.products.transport.Ticket;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public class LuxuryVacationOfferFactory implements VacationOfferFactory {
    @Override
    public Hotel createHotel() {
        System.out.println("Tworzę hotel: Hilton");
        return new HiltonHotel();
    }

    @Override
    public FoodOffer createFoodOffer() {
        System.out.println("Tworzę jedzenie: Premium");
        return new PremiumFoodOffer();
    }

    @Override
    public Ticket prepareTicket() {
        System.out.println("Tworzę bilet standard: Fly");
        return new FlyTicket();
    }
}
