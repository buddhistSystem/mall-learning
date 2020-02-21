package test.thread;

import java.util.concurrent.*;

/**
 * 获取线程返回值，FutureTask和线程池方法
 */
public class CallableTest implements Callable<String> {
    @Override
    public String call() throws Exception {
        String str = "hello world";
        Thread.currentThread().sleep(3000);
        return str;
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        futureTaskTest();
        threadPoolTest();
    }
    //使用FutureTask接收线程的返回值
    public static void futureTaskTest() throws ExecutionException, InterruptedException {
        FutureTask task = new FutureTask(new CallableTest());
        Thread thread = new Thread(task);
        thread.start();
        if (!task.isDone()) {
            System.out.println("未执行完成");
        }
        System.out.println(task.get());
    }
    //使用线程池接收返回值
    public static void threadPoolTest() throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();
        Future<String> future = es.submit(new CallableTest());
        if (!future.isDone()) {
            System.out.println("未执行完成");
        }
        System.out.println(future.get());
    }
}
