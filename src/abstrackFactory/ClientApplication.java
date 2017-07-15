package abstrackFactory;

import abstrackFactory.factory.EconomyVacationOfferFactory;
import abstrackFactory.factory.LuxuryVacationOfferFactory;
import abstrackFactory.factory.VacationOfferFactory;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public class ClientApplication {
    public static void main(String[] args) {
        VacationOfferFactory luxuryOfferFactory = new LuxuryVacationOfferFactory();
        VacationOfferFactory economyOfferFactory = new EconomyVacationOfferFactory();

        System.out.println("Przychodzi Szejk");
        luxuryOfferFactory.createFoodOffer();
        luxuryOfferFactory.createHotel();
        luxuryOfferFactory.prepareTicket();
        System.out.println("-------------------------");

        System.out.println("Przychodzi Kowalski");
        economyOfferFactory.createFoodOffer();
        economyOfferFactory.createHotel();
        economyOfferFactory.prepareTicket();

        System.out.println("-------------------------");
        System.out.println("Przychodzi typowy polski turysta");
        luxuryOfferFactory.createHotel();
        economyOfferFactory.createFoodOffer();
        economyOfferFactory.prepareTicket();


    }
}
