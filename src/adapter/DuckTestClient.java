package adapter;

import adapter.adaptee.WildTurkey;
import adapter.target.Duck;
import adapter.target.MallardDuck;

/**
 * Created by wangshiyi on 17/9/1.
 * <p>
 * 适配器模式（Adapter Pattern），将一个类的接口转换成客户期望的另一个接口
 * 适配器使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
 */

public class DuckTestClient {

    public static void main(String[] args) {

        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey); // 将火鸡包装进一个火鸡适配器中，使它看起来像是一只鸭子

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    /**
     * 客户端期望的是一个鸭子
     *
     * @param duck
     */
    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}