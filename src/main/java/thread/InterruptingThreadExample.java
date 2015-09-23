package thread;

import java.util.concurrent.TimeUnit;

/**
 * Created by Farrukhjon on 23-Sep-15.
 */
public class InterruptingThreadExample {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + " is alive?: " + Thread.currentThread().isAlive());

        SomeThread someThread = new SomeThread();
        someThread.start();

        //someThread.join();
        someThread.interrupt();
    }

    private static class SomeThread extends Thread {

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                try {
                    System.out.println(getName() + " is not interrupted " + i);
                    TimeUnit.MICROSECONDS.sleep(1);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }
}
