package observer_and_adapter.observer;

import java.util.Map;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public class SendEmailServiceConcreteObserver implements Observer {
    @Override
    public void notifyMe(Map<String, Integer> sharePrices) {
        System.out.println(getClass().getSimpleName() + " I have just been notified about new prices");
        System.out.println("E-mails:");
        for (String name : sharePrices.keySet()){
            int price = sharePrices.get(name);
            if(price > 600) {
                System.out.println("Wysyłam maila do " + name + " ponieważ cena wzrosła powyżej 600 PLN");
            }
        }
    }
}