package demo.test.create.build;

public class TransformerBuilder {
    public static Autobots Transforming(Transformer transformer){
        transformer.Create_Head();
        transformer.Create_Body();
        return transformer.transforming();
    }

    public static void main(String[] args) {
        Transformer transformer=new Transformer_Captain();
        Transforming(transformer);
    }

}
