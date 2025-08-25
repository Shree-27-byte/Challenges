package core_java;
public class MultiThread07 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Running " + Thread.currentThread().getName());
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " interrupted");
                    Thread.currentThread().interrupt(); // preserve interrupt status
                }
            }
        }, "Thread-1");

        t1.start();

        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        t1.interrupt();
    }
}

