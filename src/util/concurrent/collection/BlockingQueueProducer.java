package util.concurrent.collection;

import java.util.concurrent.BlockingQueue;

public class BlockingQueueProducer implements Runnable {

	private BlockingQueue<String>	blockingQueue;

	public BlockingQueueProducer(BlockingQueue<String> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(500);
			blockingQueue.put("Lion");
			System.out.println("blockingQueue.put('Lion')");
			Thread.sleep(1000);
			blockingQueue.put("Crocodile");
			System.out.println("blockingQueue.put('Crocodile')");
			Thread.sleep(2000);
			blockingQueue.put("Jaguar");
			System.out.println("blockingQueue.put('Jaguar')");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
