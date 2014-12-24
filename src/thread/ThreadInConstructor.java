package thread;

public class ThreadInConstructor {

	public ThreadInConstructor() throws InterruptedException {

		Thread t1 = new Thread(new ClassForT1());
		t1.start();
		Thread t2 = new Thread(new ClassForT2());
		t2.start();
	}

	public static void main(String[] args) {
		try {
			new ThreadInConstructor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
