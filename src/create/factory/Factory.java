package create.factory;

/**
 * 工厂模式
 * 模式意图：工厂方法意在分离产品与创建的两个层次，使用户在一个工厂池中可以选择自己想要使用的产品，而忽略其创建过程
 * 模式结构：Creator 创建工厂的接口 ConcreteCreator 具体的产品创建者 Product 产品的接口 ConcreteProduct 具体的产品
 * 使用场景：
 * 1 当一个类不知道它所必须创建的对象的类的时候
 * 2 当一个类希望由他的子类来制定它所创建的对象的时候
 * 3 当类创建对象的职责委托给多个帮助子类中的某一个，并且希望进行一些信息的局部初始化的时候
 */
public class Factory {

    public static Creator creator1,creator2;
    public static Product product1,product2;

    public static void main(String[] args) {
        creator1=new ConcreteCreator1();
        creator2=new ConcreteCreator2();

        product1=creator1.factory();
        product2=creator2.factory();

        product1.say();
        product2.say();


    }


}
