package proxy.statics;

import proxy.Car;

/**
 * Created by wangshiyi on 17/6/25.
 *
 * 通过继承实现Car的时间代理（不推荐）
 */

public class ProxyByExtend extends Car {

    @Override
    public void move() {

        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶......");

        System.out.println("日志开始......");

        super.move();

        System.out.println("日志结束......");

        long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行驶......");
        System.out.println("汽车行驶时间：" + (endTime - startTime) + "毫秒！");
    }
}
