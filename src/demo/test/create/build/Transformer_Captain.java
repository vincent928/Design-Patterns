package demo.test.create.build;

public class Transformer_Captain implements Transformer {
    @Override
    public void Create_Head() {
        System.out.println("变出头部");
    }

    @Override
    public void Create_Body() {
        System.out.println("变出身体");
    }

    @Override
    public Autobots transforming() {
        return new Autobots();
    }
}
