package util.concurrent.lock;

import java.util.concurrent.locks.Lock;

public class Counter {

	private int		count;
	private Lock	lock;

	public Counter(Lock lock) {
		this.lock = lock;
	}

	public final int getCount() {
		lock.lock();
		try {
			count++;
		} finally {
			lock.unlock();
		}
		return count;
	}

}
