package core_java;
public class MultiThread03 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Thread: " + Thread.currentThread().getName() + ", Priority: " + Thread.currentThread().getPriority()));
        Thread t2 = new Thread(() -> System.out.println("Thread: " + Thread.currentThread().getName() + ", Priority: " + Thread.currentThread().getPriority()));

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
