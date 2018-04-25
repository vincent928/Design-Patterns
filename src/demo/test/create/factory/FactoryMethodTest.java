package demo.test.create.factory;

public class FactoryMethodTest {
    public static KFC waiter;
    public static Client client1,client2;

    public static KFC makeChoice(KFC maker){
        if (maker instanceof Bread_Menu){
            return new Bread_Menu();
        }else {
            return new Cola_Menu();
        }


    }

    public static void main(String[] args) {
        System.out.println("-----------------想吃面包-----------------");
        waiter=makeChoice(new Bread_Menu());
        client1=waiter.working();
        client1.eating();

        System.out.println("-----------------想吃可乐-----------------");
        waiter=makeChoice(new Cola_Menu());
        client2=waiter.working();
        client2.eating();

    }
}
