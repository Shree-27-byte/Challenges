package core_java;
public class MultiThread14 {
    private static volatile boolean flag = false;

    static class Worker extends Thread {
        public void run() {
            System.out.println("Worker started, waiting for flag to become true...");
            while (!flag) {
                // Busy wait
            }
            System.out.println("Flag is true, worker proceeds.");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        worker.start();

        Thread.sleep(1000);
        flag = true;
        System.out.println("Flag set to true");
    }
}
