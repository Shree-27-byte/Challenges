package core_java;
import java.util.concurrent.*;

class CyclicTask implements Runnable {
    private CyclicBarrier barrier;
    private String name;

    CyclicTask(CyclicBarrier barrier, String name) {
        this.barrier = barrier;
        this.name = name;
    }

    public void run() {
        try {
            System.out.println(name + " waiting at barrier");
            barrier.await();
            System.out.println(name + " passed the barrier");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class MultiThread20 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> {
            System.out.println("All parties have reached the barrier. Let's proceed...");
        });

        new Thread(new CyclicTask(barrier, "Thread-A")).start();
        new Thread(new CyclicTask(barrier, "Thread-B")).start();
        new Thread(new CyclicTask(barrier, "Thread-C")).start();
    }
}

