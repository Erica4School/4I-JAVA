import javax.swing.*;

public class MainSim {
	public static void main(String[] args) {
//creare l istanza di 1 SIM con saldo 0
	sim simErica = new sim(0);
//definito il numero di max di ricariche 
	int x = Integer.parseInt(JOptionPane.showInputDialog("inserisci num max di ricariche"));
//creare array di ricariche
	ricarica[] ricaricheErica = new ricarica[x];
	//popolare il mio array 
	ricaricheErica[0] = new ricarica(20.0, "2023-07-02");
	ricaricheErica[1] = new ricarica(10.0, "2023-05-02");
	ricaricheErica[2] = new ricarica(5.0, "2023-03-02");
	//effettuo ricarica su simErica
	simErica.effettuaRicarica(100);
	//controllo numero max
	if(ricaricheErica.length<=x) {
		//passo fare un altra ricarica
		ricaricheErica[3] = new ricarica(100.0, "2023-03-02");
	}
	else {
		System.out.println("limite di ricariche raggiunto. impossibile procedere");
	}
	
	//stamapre il saldo
	System.out.println("saldo "+ simErica.getSaldo());
	
	//voglio stampare le ricariche FOR-EACH
	for (ricarica pippo: ricaricheErica) {
		System.out.println(pippo);
		//arrays.tostring
		
	}
	
	
	
	
	//2 metodo 
	//ricarica ricaricheErica []= {
	//		new ricarica(20.0, "2023-07-02"),
	//		new ricarica(20.0, "2023-07-02"),
	//};
}}
