package factory.creator;

import factory.products.Car;
import factory.products.skoda.SkodaFabiaCar;
import factory.products.skoda.SkodaSuperbCar;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public class SkodaCarFactory implements CarFactory {
    @Override
    public Car createCar(CarType carType) {
        if (carType == CarType.COMPACT) {
            Car skodaFabiaCar = new SkodaFabiaCar();
            System.out.println("Tworze samochód: " + skodaFabiaCar.getClass().getSimpleName());
            skodaFabiaCar.setEngine("90KM");
            skodaFabiaCar.setColour("Green");
            System.out.println("-----------------------------------");
            return skodaFabiaCar;
        } else if (carType == carType.SEDAN) {
            Car skodaSuperbCar = new SkodaSuperbCar();
            System.out.println("Tworze samochód: " + skodaSuperbCar.getClass().getSimpleName());
            skodaSuperbCar.setEngine("160KM");
            skodaSuperbCar.setColour("Yellow");
            System.out.println("-----------------------------------");
            return skodaSuperbCar;
        } else {
            return null;
        }
    }
}
