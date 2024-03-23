public class Main {
    public static void main(String[] args) {
        Semaforo semaphore = new Semaforo(0);
        int numcoseProdotte = 3;
        int numConsumers = 2;

        for (int i = 0; i < numcoseProdotte; i++) {
            Producer producer = new Producer(semaphore);
            producer.start();
        }

        for (int i = 0; i < numConsumers; i++) {
            Consumer consumer1 = new Consumer(semaphore, "1");
            Consumer consumer2 = new Consumer(semaphore, "2");
            consumer1.start(); 
            System.out.println("è pronto il consumatore "+ consumer1.getNome());
            consumer2.start();
            System.out.println("è pronto il consumatore"+ consumer2.getNome());
            
        }
    }
}

//spiegazione in https://youtu.be/RSlD4yWW7cA?feature=shared
