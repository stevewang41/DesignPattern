package proxy.dynamic;

import proxy.Car;
import proxy.Movable;

import java.lang.reflect.Proxy;

/**
 * Created by wangshiyi on 17/6/26.
 *
 * JDK动态代理：不需要在设计实现的时候就指定某一个代理类来代理哪一个被代理对象，把这种指定延迟到程序运行时由JVM来实现
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
