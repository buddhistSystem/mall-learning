package test.thread;

public class ThreadTest implements Runnable {

    @Override
    public void run() {
        System.out.println("Test");
        System.out.println(Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        Thread t = new Thread(threadTest);
        //t.run();
        t.start();
    }
}
