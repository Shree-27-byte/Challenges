package core_java;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThread15 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        Runnable task = () -> System.out.println("Running task in " + Thread.currentThread().getName());

        for (int i = 0; i < 4; i++) {
            executor.execute(task);
        }

        executor.shutdown();
    }
}

