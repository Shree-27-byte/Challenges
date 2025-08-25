package core_java;
import java.util.concurrent.locks.*;

class SharedBuffer {
    private String message;
    private boolean hasMessage = false;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void write(String msg) {
        lock.lock();
        try {
            while (hasMessage) {
                condition.await();
            }
            message = msg;
            hasMessage = true;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public String read() {
        lock.lock();
        try {
            while (!hasMessage) {
                condition.await();
            }
            hasMessage = false;
            condition.signalAll();
            return message;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } finally {
            lock.unlock();
        }
    }
}

public class MultiThread26 {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Thread writer = new Thread(() -> {
            buffer.write("Hello from writer");
        });

        Thread reader = new Thread(() -> {
            System.out.println("Reader received: " + buffer.read());
        });

        writer.start();
        reader.start();
    }
}

