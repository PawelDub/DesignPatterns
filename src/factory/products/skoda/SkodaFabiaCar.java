package factory.products.skoda;

import factory.products.Car;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public class SkodaFabiaCar implements Car {

    private double lenght;
    private double width;

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private double height;
    private double weight;

    @Override
    public void setEngine(String engine) {
        System.out.println("Silnik: " + engine);
    }

    @Override
    public void setColour(String colour) {
        System.out.println("Colour: " + colour);
    }
}
