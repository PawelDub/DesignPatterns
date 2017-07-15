package observer_and_adapter;

import observer_and_adapter.observer.SellShareAdapterObserver;
import observer_and_adapter.observer.*;
import observer_and_adapter.subject.MarketShareServiceSubject;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public class ClientApplication {
    public static void main(String[] args) {
        MarketShareServiceSubject marketShareServiceSubject = new MarketShareServiceSubject("PZU", "ORLEN", "LOTOS");

        Observer sendAlarmServiceConcreteObserver = new SendAlarmServiceConcreteObserver();
        Observer printObbserver = new PrintServiceConcreteObserver();
        Observer sellShareAdapterObserver = new SellShareAdapterObserver();
        Observer sendEmailServiceConcreteObserver = new SendEmailServiceConcreteObserver();

        marketShareServiceSubject.registerObserver(sendAlarmServiceConcreteObserver);
        marketShareServiceSubject.registerObserver(printObbserver);
        marketShareServiceSubject.registerObserver(sellShareAdapterObserver);
        marketShareServiceSubject.registerObserver(sendEmailServiceConcreteObserver);
        System.out.println("-----------------------------");
        marketShareServiceSubject.generatePrices();
//        marketShareServiceSubject.unregisterObserver(sellShareAdapterObserver);
//        marketShareServiceSubject.generatePrices();
    }
}