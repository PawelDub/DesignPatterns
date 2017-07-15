package factory.creator;

import factory.products.Car;
import factory.products.audi.AudiA3Car;
import factory.products.audi.AudiA8Car;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public class AudiCarFactory implements CarFactory {
    @Override
    public Car createCar(CarType carType) {
        if (carType == CarType.SEDAN) {
            Car audiA8Car = new AudiA8Car();
            System.out.println("Tworze samochód: " + audiA8Car.getClass().getSimpleName());
            audiA8Car.setEngine("320KM");
            audiA8Car.setColour("Red");
            System.out.println("-----------------------------------");
            return audiA8Car;
        } else if (carType == carType.COMPACT) {
            Car audiA3Car = new AudiA3Car();
            System.out.println("Tworze samochód: " + audiA3Car.getClass().getSimpleName());
            audiA3Car.setEngine("120KM");
            audiA3Car.setColour("Blue");
            System.out.println("-----------------------------------");
            return audiA3Car;
        } else {
            return null;
        }
    }
}