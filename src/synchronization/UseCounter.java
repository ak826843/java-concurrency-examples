package synchronization;

public class UseCounter implements Runnable {

	public void increment() {
		synchronized (this) {
			Counter.count++;
			System.out.print(Counter.count + " ");
		}
	}

	public void run() {
		increment();
		increment();
		increment();
	}

	public static void main(String args[]) {
		UseCounter c = new UseCounter();
		
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
