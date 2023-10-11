import java.util.Scanner;
//esercizio 2 pag 59 libro hoepli 
import javax.swing.JOptionPane;

public class mainEle {

	public static void main(String[] args) {
int x = Integer.parseInt(JOptionPane.showInputDialog("inserire il carico"));
lavatrice lavatrice = new lavatrice("Lavatrice", "winnie lavatrice",  6, x);
lavastoviglie lavastoviglie = new lavastoviglie("Lavastoviglie", "finish ultra",  8, x);
        System.out.println("Inserisci il tipo di oggetti da lavare:");
        Scanner scanner = new Scanner (System.in);
        String nome = scanner.nextLine();

        if (nome.equalsIgnoreCase("piatti")||nome.equalsIgnoreCase("bicchieri")) {

        	lavastoviglie.Lavaggio(x);}
else {lavatrice.Lavaggio(x);
}


	}

}
