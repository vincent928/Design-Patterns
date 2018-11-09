package listener.fullDemo;

/**
 *
 */
public class Demo {

    public static void main(String[] args) {
        EventSource eventSource = new EventSource();
        EventSource2 eventSource2 = new EventSource2();

        //listener
        IEventListener listener = new IEventListener() {
            @Override
            public void doEvent(IEvent args) {
                if (args.isEventBegin() == true){
                    System.out.println("事件开始");
                }else if(args.isEventChange() == true){
                    System.out.println("事件改变");
                }
            }
        };

        //注册监听器到事件源
        eventSource.setIEventListener(listener);
        eventSource2.setIEventListener(listener);

        eventSource.changeEventHappend();
        eventSource2.beginEventHappend();

    }


}
