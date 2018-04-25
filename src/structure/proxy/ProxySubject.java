package structure.proxy;

public class ProxySubject implements Subject {
    private RealSubject subject;

    @Override
    public void request() {

    }

    public void preRequest(){
        System.out.println("ConcreteSubject preRequest()");
    }

}
