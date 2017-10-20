package adapter.target;

/**
 * Created by wangshiyi on 17/9/1.
 *
 * 绿头鸭
 */

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
