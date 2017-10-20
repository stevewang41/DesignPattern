package proxy.statics;

import proxy.Car;

/**
 * Created by wangshiyi on 17/6/25.
 *
 * 静态代理
 */

public class TestStaticProxy {

    public static void main(String[] args) {

        Car car = new Car();
        car.move();
        System.out.println("========================");

        CarLogProxy carLogProxy = new CarLogProxy(car);
        CarTimeProxy carTimeProxy = new CarTimeProxy(carLogProxy);
        carTimeProxy.move();    // 先记录汽车的行驶时间，后记录日志（注意与装饰器模式区分）

    }
}