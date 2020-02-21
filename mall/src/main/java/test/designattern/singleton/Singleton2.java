package test.designattern.singleton;

/**
 * 单例模式静态内部类
 *
 * @author liqian
 */
public class Singleton2 {

    private static class SingletonHolder {
        private static Singleton2 INSTANCE = new Singleton2();
    }

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
