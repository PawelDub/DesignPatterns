package observer_and_adapter.observer;

import java.util.Map;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public class PrintServiceConcreteObserver implements Observer {
    @Override
    public void notifyMe(Map<String, Integer> sharePrices) {
        System.out.println(getClass().getSimpleName() + ": I have just been notified about new prices");
        for(String name : sharePrices.keySet()) {
            System.out.println("Firma: " + name + " kosztuje: " + sharePrices.get(name));
        }
    }
}