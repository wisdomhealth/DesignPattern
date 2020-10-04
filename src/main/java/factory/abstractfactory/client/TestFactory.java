package factory.abstractfactory.client;

import factory.abstractfactory.mobile.Mobile;
import factory.abstractfactory.plane.Plane;
import factory.abstractfactory.factory.FactoryOne;
import factory.abstractfactory.factory.FactoryTwo;
import factory.simple.Car;

public class TestFactory {

    public static void main(String[] args) {
        Car byd = new FactoryTwo().getCarByFactory();
        byd.getCar();
        Plane airPlane = new FactoryOne().getPlaneByFactory();
        airPlane.getPlane();
        Mobile apple = new FactoryOne().getMobileByFactory();
        apple.getMobile();
    }
}
