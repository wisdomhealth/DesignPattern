package factory.simple.client;

import factory.simple.BYD;
import factory.simple.Car;
import factory.simple.CarFactory;

public class Client {
    public static void main(String[] args) {
        Car car = CarFactory.carFactory(BYD.class);
        car.getCar();
    }
}
