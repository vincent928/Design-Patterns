package structure.proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("ConcreteSubject request()");
    }
}
