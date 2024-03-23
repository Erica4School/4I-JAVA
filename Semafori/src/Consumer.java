class Consumer extends Thread {
    private Semaforo semaphore;
	private  String nome;

    public String getNome() {
		return nome;
	}

	public Consumer(Semaforo semaphore, String nome) {
        this.semaphore = semaphore;
        this.nome = nome;
    }

    @Override
    public void run() {
        while (true) {
            try {
                semaphore.decrement();
                sleep(2000); // Simula un processo di consumo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

