package observer_and_adapter.subject;

import observer_and_adapter.observer.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public class MarketShareServiceSubject {
    private List<Observer> observers = new ArrayList<Observer>();

    public MarketShareServiceSubject(String...companynames) {
        this.companyNames = companynames;
    }

    public void registerObserver(Observer observer){
        System.out.println("Dodalem nowego observatora: " + observer.getClass().getSimpleName());
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        System.out.println("----Skasowano observatora: " + observer.getClass().getSimpleName() + "-----");
        observers.remove(observer);
    }

    private String[] companyNames;

    public void generatePrices() {
        Map<String, Integer> sharePrices = new HashMap<>();
        System.out.println("Nowe ceny");
        for (String companyName : companyNames) {
            int newRandomPrice = getRandomPrice();
            sharePrices.put(companyName, newRandomPrice);
            System.out.println(companyName + " : " + newRandomPrice);
        }
        notifyObserver(sharePrices);
    }

    private void notifyObserver(Map<String, Integer> sharePrices) {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        for (Observer observer : observers) {
            System.out.println("Informuję: " + observer.getClass().getSimpleName());
            observer.notifyMe(sharePrices);
            System.out.println(observer.getClass().getSimpleName() + ": został poinformowany");
            System.out.println("______________________________________");
        }
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        observers.forEach( observer_and_adapter -> observer_and_adapter.notifyMe(sharePrices));
    }

    private int getRandomPrice() {
        return new Random().nextInt(1000) +1;
    }
}