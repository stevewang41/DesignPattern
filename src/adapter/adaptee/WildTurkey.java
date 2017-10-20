package adapter.adaptee;

/**
 * Created by wangshiyi on 17/9/1.
 *
 * 野生火鸡
 */

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
