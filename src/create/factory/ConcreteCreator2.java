package create.factory;

public class ConcreteCreator2 implements Creator {

    @Override
    public Product factory() {
        return new ConcreteProduct2();
    }
}
