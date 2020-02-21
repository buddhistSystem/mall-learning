package test.thread;

/**
 * 获取线程的返回值，主线程等待法和join
 */
public class CycleWait implements Runnable {
    private String value;
    @Override
    public void run() {
        try {
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        value = "hello world";
    }
    public static void main(String[] args) throws InterruptedException {
        CycleWait cycleWait = new CycleWait();
        Thread t = new Thread(cycleWait);
        t.start();
        //主线程等待法
        while (cycleWait.value == null) {
            Thread.currentThread().sleep(100);
        }
        //join
        t.join();
        System.out.println(cycleWait.value);
    }
}
