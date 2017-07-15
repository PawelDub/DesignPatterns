package factory.creator;

import factory.products.Car;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public interface CarFactory {
    Car createCar(CarType carType);
}
