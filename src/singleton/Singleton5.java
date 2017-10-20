package singleton;

/**
 * Created by wangshiyi on 17/8/31.
 * <p>
 * 静态内部类式单例，同属于饿汉
 * <p>
 * 是否多线程安全：是
 * 是否延迟实例化：是
 */

public class Singleton5 {

    private static class SingletonHolder {
        private static Singleton5 instance = new Singleton5();  // 利用Java类动态加载机制实现延迟实例化
    }

    private Singleton5() {

    }

    public static Singleton5 getInstance() {
        return SingletonHolder.instance;
    }
}
