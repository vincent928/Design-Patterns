package create.singleton;

/**
 * 单例模式
 * 模式意图：保证类仅有一个实例，并且可以供应用程序全局使用。为了保证这一点，就需要这个类自己创建自己的对象，并且对外有公开的调用方法
 * 模式结构：Singleton 单例类，内部包含一个本身的对象。并且构造方法时私有的
 * 使用场景：当类只有一个实例，而且可以从一个固定的访问点访问它时
 *
 * 饿汉式：通过定义static变量，在类加载时，静态变量被初始化
 */
 class Singleton {

    private static final Singleton singleton=new Singleton();

    /**
     * 私有的构造函数
     */
    private Singleton(){

    }

    /**
     * 获得实例对象
     */
    public static Singleton getInstance(){
        return singleton;
    }


}
