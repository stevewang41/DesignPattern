package singleton;

/**
 * Created by wangshiyi on 17/8/31.
 * <p>
 * 线程安全的懒汉式单例
 * <p>
 * 是否多线程安全：是
 * 是否延迟实例化：是
 */

public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {

    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {     // 只有第一次同步是有用的，以后的每一次同步都是累赘
            instance = new Singleton2();
        }
        return instance;
    }
}
