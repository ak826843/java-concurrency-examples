package thread;

public class ClassForT2 implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println("Class For T2 " + ClassForT1.getInstance().getInfo());
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
