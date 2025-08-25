package core_java;
import java.util.concurrent.Semaphore;

class PrinterThread extends Thread {
    private Semaphore semaphore;
    private String name;

    PrinterThread(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }

    public void run() {
        try {
            semaphore.acquire();
            System.out.println(name + " is printing...");
            Thread.sleep(1000);
            System.out.println(name + " is done printing.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}

public class MultiThread21 {
    public static void main(String[] args) {
        Semaphore printer = new Semaphore(2); // allow 2 threads at a time

        new PrinterThread(printer, "User-1").start();
        new PrinterThread(printer, "User-2").start();
        new PrinterThread(printer, "User-3").start();
        new PrinterThread(printer, "User-4").start();
    }
}
