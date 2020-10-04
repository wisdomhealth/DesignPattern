package factory.abstractfactory.factory;

import factory.abstractfactory.mobile.Apple;
import factory.abstractfactory.mobile.Mobile;
import factory.abstractfactory.plane.AirPlane;
import factory.abstractfactory.plane.Plane;
import factory.simple.BMW;
import factory.simple.Car;

/**
 *
 * 具体工厂类
 */
public class FactoryOne implements Factory{

    @Override
    public Car getCarByFactory() {
        return new BMW();
    }

    @Override
    public Plane getPlaneByFactory() {
        return new AirPlane();
    }
    @Override
    public Mobile getMobileByFactory() {
        return new Apple();
    }
}
