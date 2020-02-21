package test.thread;

public class StopThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (!Thread.currentThread().isInterrupted()) {
                        System.out.println("===");
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getState());
                }
            }
        });
        t.start();
        Thread.currentThread().sleep(3000);
        t.interrupt();
    }
}
