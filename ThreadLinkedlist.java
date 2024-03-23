//
// consumer - producer con linkedlist di int
//la linkedlist simula un buffer

import java.util.LinkedList;

public class ThreadLinkedlist {
	public static void main(String[] args)
		throws InterruptedException
	{
		// oggetto che fa da producer e consumer
		final PC pc = new PC();

		// Creato un producer thread
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run()
			{
				try {
					pc.produce();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Creato un consumer thread
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run()
			{
				try {
					pc.consume();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		
		t1.start();
		t2.start();

		// t1 finisce prima t2
		t1.join();
		t2.join();
	}

	
	public static class PC {

		
		LinkedList<Integer> list = new LinkedList<>();
		int capacity = 2;


		public void produce() throws InterruptedException
		{
			int value = 0;
			while (true) {
				synchronized (this)
				{
					// producer thread aspetta poiche è piena
					while (list.size() == capacity)
						wait();

					System.out.println("Producer produce-"
									+ value);

					list.add(value++);

					
					notify();

				
					Thread.sleep(1000);
				}
			}
		}

		
		public void consume() throws InterruptedException
		{
			while (true) {
				synchronized (this)
				{
					
					while (list.size() == 0)
						wait();

					int val = list.removeFirst();

					System.out.println("Consumer consuma-"
									+ val);

					
					notify();

			
					Thread.sleep(1000);
				}
			}
		}
	}
}
