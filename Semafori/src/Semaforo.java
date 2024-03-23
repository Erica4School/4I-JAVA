class Semaforo {
    private int count;

    public Semaforo(int initialValue) {
        this.count = initialValue;
    }

    public synchronized void increment() {
        count++;
        System.out.println("Produttore produce: " + count);
        notify(); // Notifica un eventuale thread in attesa di consumare
    }

    public synchronized void decrement() throws InterruptedException {
        while (count == 0) {
            wait(); // Attende finché la risorsa non diventa disponibile
        }
        count--;
        System.out.println("Consumatore perleva e ora le risorse libere sono: " + count);
    }
}
