package test.designattern.singleton;

/**
 * 单例模式懒汉式
 * 以时间换空间
 *
 * @author liqian
 */
public class  Singleton {

    private Singleton() {
    }

    private static Singleton singleton;

    /**
     * 该种方法在多线程模式下并不安全，可能多个线程同时
     * 判断singleton==null为true，从而创建多个实例所以
     * 需要将该方法加锁
     *
     * @return singleton
     */
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
