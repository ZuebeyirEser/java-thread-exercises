package headfirstjava.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ClosingTime {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        threadPool.execute(new LongJob("Long Job"));
        threadPool.execute(new ShortJob("Short Job"));

        // shutdown will shutdown gracefully
        threadPool.shutdown();
        try {
            boolean finished = threadPool.awaitTermination(5, TimeUnit.SECONDS);
            System.out.println("Finished? " + finished);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadPool.shutdownNow();
    }
    public static class LongJob implements Runnable {
        private String name;

        public LongJob(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name + " started.");
            try {
                // Simulate a long-running task
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
            }
            System.out.println(name + " finished.");
        }
    }
    public static class ShortJob implements Runnable {
        private String name;

        public ShortJob(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name + " started.");
            // Simulate a short-running task
            System.out.println(name + " finished.");
        }
    }


}
