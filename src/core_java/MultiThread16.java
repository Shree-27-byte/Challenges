package core_java;
class InterruptibleWorker extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("InterruptibleWorker running: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
    }
}

public class MultiThread16 {
    public static void main(String[] args) {
        InterruptibleWorker worker = new InterruptibleWorker();
        worker.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        worker.interrupt(); // interrupting the thread
    }
}
