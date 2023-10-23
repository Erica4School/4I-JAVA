import java.io.*;

public class principaleee {
	public static void main(String[] args) throws NumberFormatException, IOException {
//Pizza pippo = new PizzaPersonalizzata("margherita", "farina riso", "maxi", 5, 300);
BufferedReader a = new BufferedReader(new InputStreamReader(System.in));		
int x = Integer.parseInt(	a.readLine());
String nome ;
String farina;
String dimensione;;
int scontrino=0;
		PizzaPersonalizzata[] pippo = new PizzaPersonalizzata[x];	
		for (int i =0; i<pippo.length; i++) {
			nome = a.readLine();
			farina= a.readLine();
			dimensione= a.readLine();
			pippo[i]= new PizzaPersonalizzata(nome, farina, dimensione, 5, 400);
			scontrino += pippo[i].getCosto();
		}
System.out.println("Il costo  della pizza è "+ scontrino);
		//System.out.println("Il costo  della pizza è "+ pippo.getCosto());
		//System.out.println("le kcal della pizza sono "+ pippo.getCalorie());
	}
}
