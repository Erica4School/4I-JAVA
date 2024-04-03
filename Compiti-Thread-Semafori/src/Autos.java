import java.util.Random;

class Autos extends Thread {
    private Semaforo semaforo;

    public Autos(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    public void run() {
        while (true) {
            try {
                // Controlla lo stato del semaforo
                if (semaforo.isVerde()) {
                    System.out.println(Thread.currentThread().getName() + " - Passaggio consentito");
                    // Simula l'accelerazione e il passaggio
                    Thread.sleep((long) (Math.random() * 5000)); // Tempo casuale tra 0 e 5 secondi per attraversare l'incrocio
                } else {
                    System.out.println(Thread.currentThread().getName() + " - Semaforo ROSSO - In attesa...");
                    Thread.sleep(1000); // Attendi 1 secondo prima di controllare nuovamente
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}