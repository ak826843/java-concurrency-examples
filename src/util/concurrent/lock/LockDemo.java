package util.concurrent.lock;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

	public static void main(String[] args) {

		final Counter counter = new Counter(new ReentrantLock());
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.printf("Count at thread %s is %d %n", Thread.currentThread().getName(), counter.getCount());
			}
		};
		
		Thread t1 = new Thread(r, "T1");
		Thread t2 = new Thread(r, "T2");
		Thread t3 = new Thread(r, "T3");

		t1.start();
		t2.start();
		t3.start();
	}

}
