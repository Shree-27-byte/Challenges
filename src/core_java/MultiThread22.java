package core_java;
import java.util.concurrent.Exchanger;

class DataProducer extends Thread {
    private Exchanger<String> exchanger;

    DataProducer(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    public void run() {
        try {
            String data = "DataFromProducer";
            System.out.println("Producer exchanging: " + data);
            String response = exchanger.exchange(data);
            System.out.println("Producer received: " + response);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DataConsumer extends Thread {
    private Exchanger<String> exchanger;

    DataConsumer(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    public void run() {
        try {
            String data = "DataFromConsumer";
            System.out.println("Consumer exchanging: " + data);
            String response = exchanger.exchange(data);
            System.out.println("Consumer received: " + response);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MultiThread22 {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        new DataProducer(exchanger).start();
        new DataConsumer(exchanger).start();
    }
}

