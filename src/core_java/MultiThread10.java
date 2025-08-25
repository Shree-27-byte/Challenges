package core_java;
public class MultiThread10 {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " priority: " + Thread.currentThread().getPriority());
        };

        Thread t1 = new Thread(task, "LowPriorityThread");
        Thread t2 = new Thread(task, "HighPriorityThread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}

