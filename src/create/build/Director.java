package create.build;

public class Director {
    private Builder builder;
    public void Constructor(){
          builder = new ConcreteBuilder();
          builder.buildPart1();
          builder.buildPart2();
          builder.retrieveResult();
    }
}
