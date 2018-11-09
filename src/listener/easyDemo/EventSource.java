package listener.easyDemo;

/**
 * 事件源
 */

public class EventSource{
    private EventListener eventListener;

    //注册监听器
    public void setEventListener(EventListener args){
        eventListener = args;
    }

    //触发事件
    public void EventChange(){
        eventListener.onChange();
    }

}
