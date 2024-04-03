/*Scrivere il codice che, a partire da un Semaforo (Thread) 
e un ArrayList<Auto> (con Auto Thread) 
faccia passare un'Auto (una alla volta!) solo quando il Semaforo è Verde.

il semaforo, ogni N secondi (random) deve passare dallo stato VERDE a ROSSO (usare pure un Boolean).

Le auto, una per volta, devono guardare il Semaforo e controllare se è VERDE o ROSSO.

Se è VERDE allora accelerano e dopo N secondi (random) passano e lasciano libero l'incrocio 
*/
import java.util.ArrayList;

public class UltimoEsercizio {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        ArrayList<Autos> cars = new ArrayList<Autos>();
        semaforo.start();

        // Creazione e avvio delle auto
        for (int i = 0; i < 10; i++) { // Creiamo solo 10 auto per evitare un'output troppo lungo
            Autos a = new Autos(semaforo);
            a.setName("Auto " + (i + 1));
            cars.add(a);
            a.start();
        }
    }
}