package bridge.color;

//扩充实现类
public class Black implements Color {
    public void bepaint(String penType, String name) {

        System.out.println(penType + "黑色的" + name + ".");
    }
}