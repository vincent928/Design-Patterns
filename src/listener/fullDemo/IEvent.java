package listener.fullDemo;

/**
 * 事件
 */
public interface IEvent {

    void setIEventListener(IEventListener listener);

    boolean isEventChange();

    boolean isEventBegin();

}
