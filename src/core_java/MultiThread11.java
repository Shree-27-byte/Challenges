package core_java;
public class MultiThread11 {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("MyGroup");

        Runnable task = () -> System.out.println(Thread.currentThread().getName() + " in group: " + Thread.currentThread().getThreadGroup().getName());

        Thread t1 = new Thread(group, task, "Thread-1");
        Thread t2 = new Thread(group, task, "Thread-2");

        t1.start();
        t2.start();

        System.out.println("Active threads in group: " + group.activeCount());
    }
}

