import java.util.ArrayList;
/*Controllo di presenza in classe


1. Definire una classe `Studente` che estenda `Thread`. Ogni studente deve avere un identificativo unico e uno stato che indica se è presente in classe.
2. Definire una classe `Professore` che estenda `Thread`. Il professore controlla la presenza degli studenti in classe. Quando tutti gli studenti sono presenti, il professore annuncia che la lezione può iniziare.
3. Nella classe `Professore`, implementare un metodo `run()` che ciclicamente controlla lo stato di presenza di ciascuno studente. Il professore deve attendere fino a quando tutti gli studenti non sono presenti in classe.
4. Utilizzare il costrutto `synchronized` per garantire che il controllo della presenza sia eseguito in modo sicuro e coerente.


**Nota:**
- Si consiglia di utilizzare un ArrayList per gestire gli studenti e passarlo al professore come parametro del costruttore.
*/
public class Professore extends Thread {

	private ArrayList<Studente> array;

	public Professore(ArrayList<Studente> array) {
		this.array = array;
	}

	public void run() {
		while(true) {
			boolean comincia = true;
			for(int i=0;i<array.size();i++) {
				synchronized (array.get(i).presente) {
					if(!array.get(i).presente) {
						comincia = false;
					}
				}
			}
			if(comincia) {
				System.out.println("la lezione può cominciare!");
				break;
			}
		}
	}
}
