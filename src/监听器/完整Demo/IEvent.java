package 监听器.完整Demo;

/**
 * 事件
 */
public interface IEvent {

    void setIEventListener(IEventListener listener);

    boolean isEventChange();

    boolean isEventBegin();

}
