package util.concurrent.threadFactory;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class ExecutorsThreadFactoryDemo {

    public static void main(String[] args) {
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();

        final Runnable r = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(new Date());
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        System.out.println("Thread has been interrupted");
                        return;
                    }
                }
            }
        };

        final Thread newThread = defaultThreadFactory.newThread(r);

        newThread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        newThread.interrupt();
    }

}
