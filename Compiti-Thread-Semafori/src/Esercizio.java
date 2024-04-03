class Esercizio1 implements Runnable {
    
     char carattere;
     //metto static così esiste una sola istanza di questa variabile per tutta la classe
     static int count = 0;

    public Esercizio1(char carattere) {
        this.carattere = carattere;
    }

    public void run() {
        while (count < 10) {
            synchronized (this) {
                // Controllo se è il turno del thread usando pari o dispari
                if ((carattere == 'a' && count % 2 == 0) || (carattere == 'b' && count % 2 != 0)) {
                    System.out.println(carattere+"\n");
                    count++;
                   
                }
            }
        }
    }
}