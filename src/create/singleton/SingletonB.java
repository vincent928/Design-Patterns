package create.singleton;

/**
 * 单例模式
 * 模式意图：保证类仅有一个实例，并且可以供应用程序全局使用。为了保证这一点，就需要这个类自己创建自己的对象，并且对外有公开的调用方法
 * 模式结构：Singleton 单例类，内部包含一个本身的对象。并且构造方法时私有的
 * 使用场景：当类只有一个实例，而且可以从一个固定的访问点访问它时
 *
 * 懒汉式：需要实例时，才去创建
 */
public class SingletonB {

    private static SingletonB singletonB=null;

    /**
     * 私有构造方法
     */
    private SingletonB(){

    }

    /**
     *  同步方式，当需要实例的才去创建
     */
    public static synchronized SingletonB getInstance(){
        if (singletonB == null){
            singletonB = new SingletonB();
        }
        return singletonB;
    }


}
