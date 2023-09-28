package esRip;
import java.util.*;

import javax.swing.*;
public class VeicoloMain {

	public static void main(String[] args) {
int num= Integer.parseInt(JOptionPane.showInputDialog("quanti studenti vuoi inserire"));
	studente[] pippo = new studente[num];
	//inserire i valori nel mio array
for (int i=0; i<num; i++) {
String cognome= JOptionPane.showInputDialog("scrivi cognome");
int eta = Integer.parseInt(JOptionPane.showInputDialog("scrivi età"));
String corso= JOptionPane.showInputDialog("scrivi corso");
pippo[i] = new studente(cognome, eta, corso);
	}
	//for each
for(studente pluto: pippo) {System.out.println(pluto);}
		
		
		
		
		
		
		
		/*
		Impiegato[] impiegato = new Impiegato[3];
		Scanner sca = new Scanner(System.in);
		String c, n;
		float s;
		
		for(int i=0; i<impiegato.length; i++) {
		Impiegato imp = new Impiegato();
		System.out.println("inserisci il cognome");
		c=sca.nextLine();
		imp.setCognome(c);
		System.out.println("inserisci il nome");
		n=sca.nextLine();
		imp.setNome(n);
		System.out.println("inserisci lo stipendio");
		s=sca.nextFloat();
		imp.setStipendio(s);
		sca.nextLine();
		impiegato[i] = imp;
		}
		sca.close();
		//media stipedio impiegati
		double sommaStipendi =0;
		double mediaStipendi=0;
		for(int i=0; i<impiegato.length; i++) {
		sommaStipendi += impiegato[i].getStipendio();	
		}
		mediaStipendi= sommaStipendi/impiegato.length;
		System.out.print(mediaStipendi);
		
		
		
		
		
		
		
		
		/*double totaleSpesa=0;
		//array di oggetti 
		Prodotto[] carello = {
				new Prodotto("latte", 1.0),
				new Prodotto("mele", 2.0),
				new Prodotto("pane", 1.5),
				new Prodotto("olio", 7.0)
		};
		for(int i=0; i<carello.length; i++) {
		Prodotto prod = carello[i];	
		totaleSpesa += prod.getPrezzo();	
		}
		/*Prodotto latte= new Prodotto("latte", 1.0);
		Prodotto mele= new Prodotto("mele", 2.0);
		Prodotto pane= new Prodotto("pane", 1.5);
		Prodotto olio= new Prodotto("olio", 7.0);
		
		totaleSpesa += latte.getPrezzo();
		totaleSpesa += mele.getPrezzo();
		totaleSpesa += pane.getPrezzo();
		totaleSpesa += olio.getPrezzo();*/
		
		//System.out.print(totaleSpesa);
		
		//istanziare i miei oggetti di classe
		/*Veicolo prim = new Veicolo("toyota", "camry", 2020);
		Veicolo falam = new Veicolo("honda", "civic", 2006);
		System.out.println(prim.getDettagli());*/

	}

}
