package 监听器.完整Demo;

/**
 * 事件源：事件发生的地点
 */
public class EventSource implements IEvent{

    private IEventListener iEventListener;
    boolean change;
    boolean begin;

    //注册监听器
    @Override
    public void setIEventListener(IEventListener listener) {
        iEventListener = listener;
    }

    //触发事件
    public void changeEventHappend(){
        change = true;
        iEventListener.doEvent(this);       //此处的this为？
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
