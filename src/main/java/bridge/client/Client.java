package bridge.client;

import bridge.BigPen;
import bridge.Pen;
import bridge.color.Color;
import bridge.color.White;
import facade.facade.Facade;

public class Client {
    public static void main(String a[]) {
        Color color = new White();
        Pen pen = new BigPen();
        pen.setColor(color);
        pen.draw("鲜花");
    }
}
