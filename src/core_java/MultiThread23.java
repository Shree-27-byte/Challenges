package core_java;
import java.util.concurrent.*;

class SquareTask implements Callable<Integer> {
    private int number;

    SquareTask(int number) {
        this.number = number;
    }

    public Integer call() {
        return number * number;
    }
}

public class MultiThread23 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        CompletionService<Integer> service = new ExecutorCompletionService<>(executor);

        for (int i = 1; i <= 5; i++) {
            service.submit(new SquareTask(i));
        }

        for (int i = 1; i <= 5; i++) {
            try {
                Future<Integer> result = service.take();
                System.out.println("Result: " + result.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
}

