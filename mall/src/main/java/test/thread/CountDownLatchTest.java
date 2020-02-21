package test.thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {
        new CountDownLatchTest().go();
    }

    private void go() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        new Thread(new Task(countDownLatch),"t1").start();
        new Thread(new Task(countDownLatch),"t2").start();
        new Thread(new Task(countDownLatch),"t3").start();
        countDownLatch.await();
        System.out.println("所有线程已到达，主线程执行");
    }

    class Task implements Runnable {
        private CountDownLatch countDownLatch;

        public Task(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "已到达");
            countDownLatch.countDown();
        }
    }
}
