package proxy.statics;

import proxy.Movable;

/**
 * Created by wangshiyi on 17/6/25.
 *
 * 通过聚合实现Car的时间代理
 */

public class CarTimeProxy implements proxy.Movable {

    private Movable movable;

    public CarTimeProxy(Movable movable) {
        super();
        this.movable = movable;
    }

    @Override
    public void move() {

        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶，计时");

        movable.move();

        long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行驶，行驶时间：" + (endTime - startTime) + "毫秒！");
    }
}
