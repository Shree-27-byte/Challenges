package core_java;
public class MultiThread05 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 started");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println("Thread 1 finished");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 started");
            try { Thread.sleep(500); } catch (InterruptedException e) {}
            System.out.println("Thread 2 finished");
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Both threads finished");
    }
}

