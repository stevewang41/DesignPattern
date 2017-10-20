package proxy.dynamic;

import proxy.Car;
import proxy.Movable;

import java.lang.reflect.Proxy;

/**
 * Created by wangshiyi on 17/6/26.
 * <p>
 * JDK动态代理
 */

public class TestDynamicProxy {

    public static void main(String[] args) {

        Car car = new Car();        // 原对象（被代理对象）
        car.move();
        System.out.println("========================");

        MyInvocationHandler handler = new MyInvocationHandler(car);
        // 为原对象生成的动态代理对象
        Movable carProxy = (Movable) Proxy.newProxyInstance(car.getClass().getClassLoader(),
                car.getClass().getInterfaces(),
                handler);
        carProxy.move();

        System.out.println(carProxy.getClass().getName());
    }
}
