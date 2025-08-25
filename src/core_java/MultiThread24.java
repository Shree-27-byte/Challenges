package core_java;
import java.util.concurrent.*;

class TransferProducer implements Runnable {
    private TransferQueue<String> queue;

    TransferProducer(TransferQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            String item = "ImportantData";
            System.out.println("Producer is waiting to transfer: " + item);
            queue.transfer(item);
            System.out.println("Producer transferred: " + item);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class TransferConsumer implements Runnable {
    private TransferQueue<String> queue;

    TransferConsumer(TransferQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            String data = queue.take();
            System.out.println("Consumer received: " + data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MultiThread24 {
    public static void main(String[] args) {
        TransferQueue<String> queue = new LinkedTransferQueue<>();

        new Thread(new TransferProducer(queue)).start();
        new Thread(new TransferConsumer(queue)).start();
    }
}

