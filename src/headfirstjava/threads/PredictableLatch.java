package headfirstjava.threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PredictableLatch {
    public static void main (String[] args) {
        /*
        *   The code is really similar to the code that performs a sleep; the main difference is the
        *   latch.countDown in the main method. The performance difference is significant, though.
        *   Instead of having to wait at least two seconds to make sure main has printed its message,
        *   the new thread waits only until the main method has printed its “back in main” message.*/
        ExecutorService executor = Executors.newSingleThreadExecutor();
        CountDownLatch latch = new CountDownLatch(2);
        executor.execute(() -> waitForLatchThenPrint(latch));
        System.out.println("back in main");

        latch.countDown();
        System.out.println("some");
        executor.execute(() -> waitForLatchThenPrint(latch));
        System.out.println("some");
        latch.countDown();
        executor.shutdown();
    }
    private static void waitForLatchThenPrint(CountDownLatch latch) {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("top o’ the stack");
    }
}
