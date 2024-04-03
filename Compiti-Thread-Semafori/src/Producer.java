
public class Producer  extends Thread {
    Parcheggio semaphore;

    public Producer(Parcheggio semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        while (true) {
        	
            try {
            	 semaphore.increment();
            	 sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
         
        }
    }
}




