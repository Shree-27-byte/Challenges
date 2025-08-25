package core_java;
import java.util.concurrent.*;

class FactorialTask implements Callable<Integer> {
    private int number;

    FactorialTask(int number) {
        this.number = number;
    }

    public Integer call() throws Exception {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
            Thread.sleep(100); // simulate delay
        }
        return fact;
    }
}

public class MultiThread17 {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new FactorialTask(5));

        System.out.println("Doing other work...");

        Integer result = future.get(); // wait for result
        System.out.println("Factorial result: " + result);

        executor.shutdown();
    }
}
