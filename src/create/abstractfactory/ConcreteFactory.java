package create.abstractfactory;

public class ConcreteFactory implements AbstractFactory {
    @Override
    public AbstractProductA CreateProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB CreateProductB() {
        return new ConcreteProductB1();
    }
}
