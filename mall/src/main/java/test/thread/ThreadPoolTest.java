package test.thread;

import io.netty.util.concurrent.DefaultThreadFactory;
import sun.nio.ch.ThreadPool;

import java.util.concurrent.*;

/**
 * @Author: Administrator
 * @Date: 2019/7/26 0026 14:33
 * @Description:
 */
public class ThreadPoolTest {
    public static void main(String[] args) {

        /**
          * Executors.newFixedThreadPool(10);
          * 使用该种方式创建线程池容易造成OOM（out of memory）
          * 使用该种方式 LinkedBlockingDeque的默认容量为无限制
          */

        /**
         *  线程池的5种状态
         *  Running 能接受新提交的任务并且能处理阻塞队列中的任务
         *  Shutdown 不能接受新提交的任务，但可以处理存量任务
         *  stop    不再接受新任务，也不处理存量任务
         *  Tidying 所有任务已终止
         *  Terminated terminated方法执行后进入该状态
         *
         */
        //ExecutorService executorService =Executors.newFixedThreadPool(3);
        ExecutorService es = new ThreadPoolExecutor(
                3,
                3,
                60,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(7),
                new DefaultThreadFactory("myPool"),
                new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 10; i++) {
            Runnable runnable = () -> {
                System.out.println(Thread.currentThread().getName());
            };
            es.execute(runnable);
        }
        es.shutdown();

    }
}
