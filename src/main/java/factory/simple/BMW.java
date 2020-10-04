package factory.simple;

public class BMW implements Car {
    @Override
    public void getCar() {
        System.out.printf("来一辆BMW！");
    }
}
