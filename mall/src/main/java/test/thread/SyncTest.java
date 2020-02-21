package test.thread;

public class SyncTest implements Runnable {

    @Override
    public void run() {
        sync();
    }

    private void sync() {
        System.out.println("进入run方法的是"+Thread.currentThread().getName());
        synchronized (SyncTest.class) {
            try {
                System.out.println(Thread.currentThread().getName()+"同步开始");
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName()+"同步结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //SyncTest syncTest = new SyncTest();
        Thread t1 = new Thread(new SyncTest(), "t1");
        Thread t2 = new Thread(new SyncTest(), "t2");
        Thread t3 = new Thread(new SyncTest(), "t3");
        t1.start();
        t2.start();
        t3.start();

    }



}
