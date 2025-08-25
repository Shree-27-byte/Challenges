package core_java;
import java.util.concurrent.CountDownLatch;

public class MultiThread09 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " started");
            try { Thread.sleep(500); } catch (InterruptedException e) {}
            System.out.println(Thread.currentThread().getName() + " finished");
            latch.countDown();
        };

        new Thread(task, "Thread-1").start();
        new Thread(task, "Thread-2").start();
        new Thread(task, "Thread-3").start();

        latch.await();

        System.out.println("All threads completed");
    }
}
