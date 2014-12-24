package util.concurrent.collection;

import java.util.concurrent.BlockingQueue;

public class BlockingQueueConsumer implements Runnable {

	private BlockingQueue<String>	blockingQueue;

	public BlockingQueueConsumer(BlockingQueue<String> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		try {
			System.out.println("blockingQueue.take(): " + blockingQueue.take());
			System.out.println("blockingQueue.take(): " + blockingQueue.take());
			System.out.println("blockingQueue.take(): " + blockingQueue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
