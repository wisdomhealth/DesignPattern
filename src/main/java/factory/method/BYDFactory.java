package factory.method;

import factory.simple.BYD;
import factory.simple.Car;

public class BYDFactory implements CarFactory{

    @Override
    public Car getCarByFactory() {
        return new BYD();
    }
}
