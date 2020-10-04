package factory.abstractfactory.factory;

import factory.abstractfactory.mobile.Mobile;
import factory.abstractfactory.plane.Plane;
import factory.simple.Car;

/**
 *
 * 抽象工厂
 */
public interface Factory {
    public Car getCarByFactory();
    public Plane getPlaneByFactory();
    public Mobile getMobileByFactory();
}
