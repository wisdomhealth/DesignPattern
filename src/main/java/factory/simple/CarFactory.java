package factory.simple;

public class CarFactory {
    public static Car carFactory(Class<?> tClass){
        if (tClass.getName().equals(BMW.class.getName())){
            return new BMW();
        }
        if (tClass.getName().equals(BYD.class.getName())){
            return new BYD();
        }
        return null;
    }
}
