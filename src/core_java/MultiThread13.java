package core_java;
public class MultiThread13 {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        Runnable task = () -> {
            threadLocal.set(Thread.currentThread().getName() + "'s data");
            System.out.println(Thread.currentThread().getName() + " threadLocal value: " + threadLocal.get());
        };

        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");

        t1.start();
        t2.start();
    }
}

