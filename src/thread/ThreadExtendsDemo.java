package thread;

public class ThreadExtendsDemo extends Thread {

	public static void main(String[] args) {
		new ThreadExtendsDemo().start();
	}

	@Override
	public void run() {
		System.out.println("Hello from thread");
	}

}
