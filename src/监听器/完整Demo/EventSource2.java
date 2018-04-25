package 监听器.完整Demo;

/**
 *
 */
public class EventSource2 implements IEvent {

    private IEventListener listener;
    boolean change;
    boolean begin;

    //注册监听器
    @Override
    public void setIEventListener(IEventListener listener) {
        this.listener = listener;
    }

    //触发事件
    public void beginEventHappend(){
        begin = true;
        listener.doEvent(this);       //此处的this为？
    }

    //事件改变
    @Override
    public boolean isEventChange() {
        return change;
    }

    //事件开始
    @Override
    public boolean isEventBegin() {
        return begin;
    }


}
