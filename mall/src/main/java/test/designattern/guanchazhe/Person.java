package test.designattern.guanchazhe;

/**
 * 观察者模式
 * 观察者共同实现的接口
 *
 * @author liqian
 */
public interface Person {

    /**
     * 观察者们接收被观察者的消息
     *
     * @param msg 消息
     */
    void getMsg(String msg);
}
