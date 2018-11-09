package listener.easyDemo;

public class Demo {

    public static void main(String[] args) {
        // 事件源,即被监听的对象
        EventSource es = new EventSource();
        //listener
        EventListener eventListener = new EventListener() {
            @Override
            public void onChange() {
                System.out.println("事件改变");
            }
        };

        // 注册监听器到事件源
        es.setEventListener(eventListener);
        es.EventChange();
    }
}
