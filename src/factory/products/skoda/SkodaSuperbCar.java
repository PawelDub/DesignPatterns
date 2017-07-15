package factory.products.skoda;

import factory.products.Car;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public class SkodaSuperbCar implements Car {
    @Override
    public void setEngine(String engine) {
        System.out.println("Silnik: " + engine);
    }

    @Override
    public void setColour(String colour) {
        System.out.println("Colour: " + colour);
    }
}
