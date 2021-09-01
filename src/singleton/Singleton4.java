package singleton;

/**
 * Created by wangshiyi on 17/8/31.
 * <p>
 * 饿汉式单例
 * <p>
 * 是否多线程安全：是
 * 是否延迟实例化：否
 */

public class Singleton4 {

    private static final Singleton4 INSTANCE = new Singleton4();

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        return INSTANCE;
    }
}
