package util.concurrent.atomic;

public class AtomicExampleTest {

	public static void main(String[] args) {

		MyObject obj = new MyObject();
		obj.setWhatImReading(new Book("Java 2 From Scratch"));
		obj.setWhatImReading(new Book("Pro Java EE 5 Performance Management and Optimization"));
		
		final String name = obj.getWhatImReading().getName();
		System.out.println(name);
	}
}
