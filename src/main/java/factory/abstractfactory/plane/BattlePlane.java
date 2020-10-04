package factory.abstractfactory.plane;

public class BattlePlane implements Plane{
    @Override
    public void getPlane() {
        System.out.printf("来一架战斗机！");
    }
}
