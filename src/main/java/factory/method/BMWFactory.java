package factory.method;

import factory.simple.BMW;
import factory.simple.Car;

public class BMWFactory implements CarFactory{
    @Override
    public Car getCarByFactory() {
        return new BMW();
    }
}