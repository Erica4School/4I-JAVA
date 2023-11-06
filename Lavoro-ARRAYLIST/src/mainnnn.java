import java.util.ArrayList;

import javax.swing.JOptionPane;


public class mainnnn {

	public static void main(String[] args) {
		ArrayList <Lavoratore> lav = new ArrayList <>();
		int bonus =  Integer.parseInt(JOptionPane.showInputDialog("inserisci bvonus"));
		lav.add(new Impiegato ("mario", 1600));
		lav.add(new Operaio("giovanni", 10, 160));
		lav.add(new Manager("lorenzo", 2500, bonus));
		for (Lavoratore x: lav) {
			System.out.println("ruolo: " +x.getRuolo());
			System.out.println("euro stipendio: " +x.calcolaStipendio());
			System.out.println();
		 }
		

	}

}
