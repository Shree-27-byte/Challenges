package core_java;
public class MultiThread12 {
    private static final Object lock = new Object();
    private static boolean isProduced = false;
    private static int item = 0;

    static class Producer implements Runnable {
        public void run() {
            synchronized (lock) {
                item = 10;
                isProduced = true;
                System.out.println("Produced item: " + item);
                lock.notify();
            }
        }
    }

    static class Consumer implements Runnable {
        public void run() {
            synchronized (lock) {
                while (!isProduced) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {}
                }
                System.out.println("Consumed item: " + item);
            }
        }
    }

    public static void main(String[] args) {
        Thread consumer = new Thread(new Consumer());
        Thread producer = new Thread(new Producer());

        consumer.start();
        producer.start();
    }
}
