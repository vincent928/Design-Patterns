package webapp;

public class TicketDemo {
    public static void main(String[] args) {
        //创建资源对象
        Ticket ticket=new Ticket();
        //创建线程对象
        Thread thread1=new Thread(ticket,"窗口1");
        Thread thread2=new Thread(ticket,"窗口2");
        Thread thread3=new Thread(ticket,"窗口3");
        //启动线程
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
