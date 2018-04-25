package demo.test.create.factory;

public class Bread_Menu implements KFC{
    public Client working(){
        return new Client_Bread();
    }
}
