package proxy.statics;

import proxy.Movable;

/**
 * Created by wangshiyi on 17/6/25.
 *
 * 通过聚合实现Car的日志代理
 */

public class CarLogProxy implements proxy.Movable {

    private Movable movable;

    public CarLogProxy(Movable movable) {
        super();
        this.movable = movable;
    }

    @Override
    public void move() {

        System.out.println("日志开始......");

        movable.move();

        System.out.println("日志结束......");

    }
}
