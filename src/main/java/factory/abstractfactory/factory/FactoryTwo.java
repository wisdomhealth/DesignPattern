package factory.abstractfactory.factory;

import factory.abstractfactory.mobile.Apple;
import factory.abstractfactory.mobile.HuaWei;
import factory.abstractfactory.mobile.Mobile;
import factory.abstractfactory.plane.BattlePlane;
import factory.abstractfactory.plane.Plane;
import factory.simple.BYD;
import factory.simple.Car;

/**
 *
 * 具体工厂类
 */
public class FactoryTwo implements Factory{

    @Override
    public Car getCarByFactory() {
        return new BYD();
    }

    @Override
    public Plane getPlaneByFactory() {
        return new BattlePlane();
    }

    @Override
    public Mobile getMobileByFactory() {
        return new HuaWei();
    }
}
