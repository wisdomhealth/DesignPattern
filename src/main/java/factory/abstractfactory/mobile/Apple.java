package factory.abstractfactory.mobile;

import factory.abstractfactory.plane.Plane;

public class Apple implements Mobile {
    @Override
    public void getMobile() {
        System.out.printf("来一台苹果！");
    }
}
