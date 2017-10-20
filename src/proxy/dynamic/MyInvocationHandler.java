package proxy.dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wangshiyi on 17/6/26.
 */

public class MyInvocationHandler implements InvocationHandler {


    private Object target;  // 需要被代理的对象

    public MyInvocationHandler(Object target) {
        this.target = target;
    }


    /**
     * 执行由此InvocationHandler生成的动态代理对象的任何方法，都会被替换成执行如下的invoke()
     * 这里实现了不以硬编码方式记录汽车的行驶时间和日志
     *
     * @param proxy  代理对象
     * @param method 代理对象正在执行的方法
     * @param args   执行代理对象方法时传入的实参
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶......");

        System.out.println("日志开始......");

        // 通过反射以target作为主调来执行method方法，也就是调用被代理对象的method方法
        Object result = method.invoke(target, args);

        System.out.println("日志结束......");

        long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行驶......");
        System.out.println("汽车行驶时间：" + (endTime - startTime) + "毫秒！");

        return result;
    }
}
