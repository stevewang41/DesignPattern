package singleton;

/**
 * Created by wangshiyi on 17/8/31.
 * <p>
 * 线程不安全的懒汉式单例
 * <p>
 * 是否多线程安全：否
 * 是否延迟实例化：是    （lazy instantiate第一次调用getInstance()才初始化）
 */

public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
