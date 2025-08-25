package core_java;
import java.util.concurrent.Phaser;

class PhaseTask extends Thread {
    private Phaser phaser;

    PhaseTask(Phaser phaser, String name) {
        super(name);
        this.phaser = phaser;
        phaser.register();
    }

    public void run() {
        System.out.println(getName() + " arrived at phase 1");
        phaser.arriveAndAwaitAdvance();

        System.out.println(getName() + " arrived at phase 2");
        phaser.arriveAndAwaitAdvance();

        System.out.println(getName() + " finished");
        phaser.arriveAndDeregister();
    }
}

public class MultiThread19 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser();

        PhaseTask t1 = new PhaseTask(phaser, "Thread-1");
        PhaseTask t2 = new PhaseTask(phaser, "Thread-2");
        PhaseTask t3 = new PhaseTask(phaser, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}

