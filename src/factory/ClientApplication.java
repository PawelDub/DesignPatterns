package factory;

import factory.creator.AudiCarFactory;
import factory.creator.CarFactory;
import factory.creator.CarType;
import factory.creator.SkodaCarFactory;
import factory.products.Car;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public class ClientApplication {
    public static void main(String[] args) {
        CarFactory carFactory;

        carFactory = new AudiCarFactory();
        Car carForSheik = carFactory.createCar(CarType.SEDAN);
        Car carForAhakeWife = carFactory.createCar(CarType.COMPACT);

        carFactory = new SkodaCarFactory();
        Car carForClient = carFactory.createCar(CarType.SEDAN);
        Car carForClientWife = carFactory.createCar(CarType.COMPACT);
    }
}
