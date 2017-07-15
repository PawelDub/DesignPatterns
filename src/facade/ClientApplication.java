package facade;

import facade.facade.SimpleOrderSystem;

/**
 * Created by Pawel_D on 2017-07-03.
 */
public class ClientApplication {
    public static void main(String[] args) {
        SimpleOrderSystem simpleOrderSystem = new SimpleOrderSystem();
        String productCD = "CD";
        String productMp3 = "mp3Player";

        simpleOrderSystem.placeOrder(productCD);
        System.out.println("---------------------------------------");
        simpleOrderSystem.placeOrder(productMp3);

    }
}
