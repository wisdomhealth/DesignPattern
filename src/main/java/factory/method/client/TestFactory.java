package factory.method.client;

import factory.method.BMWFactory;
import factory.simple.Car;

public class TestFactory {
    public static void main(String[] args) {
        Car bmw= new BMWFactory().getCarByFactory();
        bmw.getCar();
    }
}
