package test.designattern.singleton;

/**
 * 单例模式饿汉式
 * 以空间换时间
 *
 * @author liqian
 */
public class Singleton1 {

    private Singleton1() {
    }

    private static Singleton1 singleton1 = new Singleton1();

    public static Singleton1 getInstance() {
        return singleton1;
    }


}
