package observer.client;

import observer.RealObserver;
import observer.RealSubject;

public class Client {
    public static void main(String[] args) {
        RealSubject subject = new RealSubject();
        RealObserver observer = new RealObserver();
        subject.addObserver(observer);
        subject.makeChanged();
    }
}
