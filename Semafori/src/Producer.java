
public class Producer  extends Thread {
	    private Semaforo semaphore;

	    public Producer(Semaforo semaphore) {
	        this.semaphore = semaphore;
	    }

	    @Override
	    public void run() {
	        while (true) {
	            semaphore.increment();
	            try {
	                sleep(1000); // Simula un processo di produzione
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}