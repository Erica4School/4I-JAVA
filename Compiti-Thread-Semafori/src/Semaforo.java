class Semaforo extends Thread {
    private boolean isVerde = true;

    public void run() {
        while (true) {
            try {
                // Passa da VERDE a ROSSO ogni N secondi (random)
                Thread.sleep((long) (Math.random() * 10000)); // Tempo casuale tra 0 e 10 secondi
                isVerde = false;
                System.out.println("Semaforo ROSSO");
                Thread.sleep(1000); // Tempo in stato ROSSO
                isVerde = true;
                System.out.println("Semaforo VERDE");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized boolean isVerde() {
        return isVerde;
    }
}
