package util.concurrent.executor.ch1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ThreadFactoryDemo {

	public static void main(String[] args) {

		ThreadFactory threadFactory = Executors.defaultThreadFactory();

		for (int i = 0; i < 10; i++) {
			final Thread t = threadFactory.newThread(new Runnable() {
				@Override
				public void run() {
					System.out.println("Current running thread name is: " + Thread.currentThread().getName());
				}
			});
			t.start();
		}

	}

}
