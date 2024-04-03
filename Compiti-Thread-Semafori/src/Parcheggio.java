



public class Parcheggio {
	  int posto = 0;
	  int auto = 25;
	  int attesa = 10000 + (int)(Math.random() * ((20000 - 10000) + 1));
	
	 public Parcheggio(int c) {
	        this.posto = c;
	    }

	 public synchronized void increment() throws InterruptedException {
		    while (posto < 10) {
		        posto++;
		        auto--;
		        System.out.println("posti occupati: " + posto);
		        System.out.println("auto in attesa: " + auto);
		        if (posto == 10) {
		            notifyAll();    }
		        wait(3000);
		    }
		}

		public synchronized void decrement() throws InterruptedException {
		    while (posto == 10) {
		        System.out.println("i posti sono occupati");
		        wait(attesa);
		    }
		    posto--;
		    auto++;
		    System.out.println("posti occupati: " + posto);
		    System.out.println("auto in attesa: " + auto);
		    notifyAll();    wait(3000);
		}

	public static void main(String[] args) {
		Parcheggio semaphore = new Parcheggio(0);
			 Producer producer = new Producer(semaphore);
			Auto consumer = new Auto(semaphore);
			 producer.start();
			 consumer.start();
			 
		 
	}



}




