package core_java;
class SyncCounter {
    private int count = 0;

    public void increment() {
        synchronized(this) {
            count++;
            System.out.println(Thread.currentThread().getName() + " count: " + count);
        }
    }
}

public class MultiThread02 {
    public static void main(String[] args) {
        SyncCounter counter = new SyncCounter();

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
                try { Thread.sleep(50); } catch (InterruptedException e) {}
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}

