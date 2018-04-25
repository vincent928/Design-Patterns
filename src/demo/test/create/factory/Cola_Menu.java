package demo.test.create.factory;

public class Cola_Menu implements KFC{
    @Override
    public Client working() {
        return new Client_Cola();
    }
}
