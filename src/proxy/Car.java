package proxy;

import java.util.Random;

/**
 * Created by wangshiyi on 17/6/25.
 *
 * 希望做到在执行move()的前后能执行某些操作，但又不想以硬编码方式将这些操作写在move()中（实现解耦）
 *
 * 应用智能引用代理可以提供对目标对象额外的服务
 */

public class Car implements Movable {

    @Override
    public void move() {

        try {
            System.out.println("汽车行驶中......");
            Thread.sleep(new Random().nextInt(1000));   // 模拟汽车行驶中
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
