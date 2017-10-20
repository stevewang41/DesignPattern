package singleton;

/**
 * Created by wangshiyi on 17/8/31.
 * <p>
 * 双重校验锁(double-checked locking)，同属于懒汉
 * <p>
 * 是否多线程安全：是
 * 是否延迟实例化：是
 */

public class Singleton3 {

    private static volatile Singleton3 instance;    // 注意volatile关键字

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {   // 只有第一次会同步
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
