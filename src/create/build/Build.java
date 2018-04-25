package create.build;

/**
 * 创建者模式：Builder
 * 模式意图：一个对象的创建十分复杂，为了区分构建过程和使用过程，因此分开。使用一个Director类进行对象的创建，Builder规定了这个创建过程
 * 模式结构：
 * Builder 抽象建造者接口，规范各个组成部分的构建
 * ConcreteBuilder 具体建造者角色，实现组成部分的构建，并提供示例
 * Product 产品角色，创建返回的对象
 * Director 导演者角色，负责创建以及使用
 * 使用场景：
 * 1 当创建对象复杂并且与其使用过程独立
 * 2 构造过程允许构造的对象有不同的表示
 */
public class Build {
}
