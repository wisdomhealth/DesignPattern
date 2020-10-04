package factory.abstractfactory.plane;

public class AirPlane implements Plane {
    @Override
    public void getPlane() {
        System.out.printf("来一架客机！");
    }
}
