package util.concurrent.collection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

	public static void main(String[] args) {
		
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(1024);
		BlockingQueueProducer producer = new BlockingQueueProducer(queue);
		BlockingQueueConsumer consumer = new BlockingQueueConsumer(queue);
		
		Thread thread1 = new Thread(producer);
		Thread thread2 = new Thread(consumer);

		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);

		thread1.start();
		thread2.start();
	}

}
