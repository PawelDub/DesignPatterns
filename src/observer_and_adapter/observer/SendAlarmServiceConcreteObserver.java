package observer_and_adapter.observer;

import java.util.Map;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public class SendAlarmServiceConcreteObserver implements Observer {
    @Override
    public void notifyMe(Map<String, Integer> sharePrices) {
        System.out.println(getClass().getSimpleName() + " I have just been notified about new prices");
        System.out.println("Alarmy:");
        for (String name : sharePrices.keySet()){
            int price = sharePrices.get(name);
            if(price < 300) {
                System.out.println("Alarm! Cena Akcji " + name + " poniżej 300 PLN");
            }
        }
    }
}