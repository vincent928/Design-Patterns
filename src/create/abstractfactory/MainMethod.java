package create.abstractfactory;

/**
 * 抽象工厂模式AbstractFactory
 *模式意图：提供对象的使用接口，隐藏对象的创建过程
 * 模式结构：
 * MainMethod 提供创建对象的接口
 * ConcreteFactory 提供真正创建对象的实现类，用于组合并创建不同的对象，实现一个产品族
 * AbstractProduct 提供对象的使用接口
 * ConcreteProduct 提供真正的适用对象，隐藏该对象的创建过程，是工厂创建的对象
 * Client 使用者，通过抽象工厂接口，使用不同的具体工厂方法创建对象组合，从而直接使用对象，无需关注对象的创建过程
 * 使用场景：
 * 1 系统独立于它的产品创建、组合和表示。即无需关心内部对象时如何创建的，怎么创建的，什么含义
 * 2 系统需要多个产品组合中的一个配置。由于对象很多，能够组合出的组合非常多，而系统只是使用某一个组合
 * 3 强调的对象的组合结果，而不是他们具体的接口和实现
 */
public class MainMethod {


    public static void main(String[] args) {
        AbstractProductA abstractProductA;
        AbstractProductB abstractProductB;
        AbstractFactory factory=new ConcreteFactory();
        abstractProductA=factory.CreateProductA();
        abstractProductB=factory.CreateProductB();
        abstractProductA.use();
        abstractProductB.use();
    }





}
