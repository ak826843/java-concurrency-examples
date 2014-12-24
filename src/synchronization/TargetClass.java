package synchronization;

public class TargetClass {

	private int	count	= 0;

	public void call(int threadId) {
		System.out.println("thread id: " + threadId);
	}

	public void graw() {
		count++;
		printCount();
	}

	public void printCount() {
		System.out.println(count);
	}

}
