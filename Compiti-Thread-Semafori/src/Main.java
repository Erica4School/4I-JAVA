public class Main {

    public static void main(String[] args) {
        Esercizio1 esercizioA = new Esercizio1('a');
        Esercizio1 esercizioB = new Esercizio1('b');

        Thread threadA = new Thread(esercizioA);
        Thread threadB = new Thread(esercizioB);

        threadA.start();
        threadB.start();
    }
}

