class Auto extends Thread {
    private Parcheggio semaphore;
	private  String nome;

    public String getNome() {
		return nome;
	}

	public Auto(Parcheggio semaphore) {
        this.semaphore = semaphore;
       
    }

 
	@Override
    public void run() {
        while (true) {
            try {
                semaphore.decrement();
                sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
