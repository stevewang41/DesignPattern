package adapter;

import adapter.adaptee.Turkey;
import adapter.target.Duck;

/**
 * Created by wangshiyi on 17/9/1.
 * <p>
 * 适配器，实现目标接口，与被适配者组合，所有的请求都委托给被适配者
 * 用火鸡冒充鸭子
 */

public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }


    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();   // 火鸡的飞行距离很短，所以飞5次
        }
    }
}
