package observer;

/**
 * Created by wangshiyi on 17/6/22.
 */

public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}