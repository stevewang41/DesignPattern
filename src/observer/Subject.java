package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangshiyi on 17/6/22.
 *
 * 被观察者
 */

public class Subject {

    private List<Observer> observers = new ArrayList<>();   // 关键代码：主体中有一个ArrayList存放观察者们

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
