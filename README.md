# Design-Patterns

tags: 设计模式 demo


------
#### java设计模式(23种)

**java的设计模式分为三大类**
 * 创建型(5种)：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式
 * 结构型(7种)：适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式
 * 行为模式型(11种)：策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式

------

#### 设计模式的原则

 1. **开闭原则：**
>对扩展开放，对修改关闭

 2. **里氏代换原则：**
>只有当衍生类可以替换掉基类，软件单位的功能不受到影响时，基类才能被真正的复用，而衍生类也能够在基类的基础上增加新的行为

 3. **依赖倒转原则：**
>这个是开闭原则的基础，对接口编程，依赖于抽象而不依赖于具体

 4. **迪米特法则(最少知道原则)：**
 >一个实体应当尽量少的与其他实体之间发生相互作用，使得系统模块得以相对独立

 5. **接口隔离原则：**
>使用多个隔离的接口来降低耦合度

 6. **合成复用原则：**
>原则是尽量使用合成/聚合的方式，而不是使用继承。继承实际上破坏了类的封装性，超类的方法可能会被子类修改。
