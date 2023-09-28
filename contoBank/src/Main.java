import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(in);
		System.out.print("Insersci il saldo iniziale: ");
		Conto contocorrente = new Conto(Double.valueOf(input.readLine()).doubleValue());
		
		System.out.print("Insersci la quantità da versare: ");
		contocorrente.versa(Double.valueOf(input.readLine()).doubleValue());
		
		System.out.print("inserisci la quantità da prelevare: ");
		double quantita = Double.valueOf(input.readLine()).doubleValue();
		if(contocorrente.getSaldo() >= quantita) contocorrente.preleva(quantita);
		else System.out.println("Saldo insufficiente");
		
		contocorrente.stampa();
		
	}

}
