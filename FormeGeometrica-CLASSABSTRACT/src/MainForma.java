import java.io.*;

/*
 * MAIN: Con un inputstreamreader, l utente inserisce 1 per cilindro 
 * o 2 rettangolo o 3 per cerchio, CON 
 * 0 FERMA IL PROGRAMMA. stampa l’area o il volume a seconda della 
 * figura INSERITA.*/
public class MainForma {

	public static void main(String[] args) throws IOException {
		BufferedReader a =new BufferedReader(new InputStreamReader (System.in));
        int utente;
        String b;
		do {
		System.out.println("inserisci 1 per cilindro \r\n"
		+ " * o 2 rettangolo o 3 per cerchio, CON \r\n"
		+ " * 0 FERMA IL PROGRAMMA.");
		b = a.readLine();
		utente = Integer.parseInt(b);
		switch(utente) {
		case 1: cilindro pippo = new cilindro(4,3); 
		        System.out.println(pippo.calcolaVolume()); break;
		case 2: Rettangolo topolino = new Rettangolo(4,3);
		        System.out.println(topolino.calcolaVolume()); 
		        System.out.println(topolino.calcolaArea());break;
		case 3: Cerchio paperino = new Cerchio(4);
        System.out.println(paperino.calcolaVolume()); 
        System.out.println(paperino.calcolaArea());break; 
        default:  System.out.println("numero non valido o hai fermato tutto");
		}
		}
        while (utente!=0);
	}

}
