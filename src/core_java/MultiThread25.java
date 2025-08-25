package core_java;
import java.util.concurrent.*;

public class MultiThread25 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Scheduled task running at: " + System.currentTimeMillis());

        scheduler.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);

        // Shutdown after 10 seconds
        scheduler.schedule(() -> {
            System.out.println("Shutting down scheduler...");
            scheduler.shutdown();
        }, 10, TimeUnit.SECONDS);
    }
}

