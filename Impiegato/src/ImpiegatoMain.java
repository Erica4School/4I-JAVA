import java.util.Scanner;
//creare un array di oggetti di 5
//inserire i valori da scanner
//calcolare la media degli stipendi di tutti

public class ImpiegatoMain {
	public static void main(String[] args) {
Scanner sca = new Scanner(System.in);
String c,n;
float s;
double mediaStipendio=0;
Impiegato [] pippo = new Impiegato [5];
for(int i =0; i<pippo.length; i++) {
Impiegato imp= new Impiegato();
System.out.println("inserisco il cognome dell impiegato");
c= sca.nextLine();
imp.setC(c);
System.out.println("inserisco il nome dell impiegato");
n= sca.nextLine();	
imp.setC(n);
System.out.println("inserisco lo stipendio dell impiegato");
s= sca.nextFloat();	
imp.setS(s);
pippo[i]=imp;
}
sca.close();
double sommaStipendio = 0;
for (int i=0; i<pippo.length; i++) {
	 sommaStipendio =  sommaStipendio + pippo[i].getS();
}


mediaStipendio =  sommaStipendio/pippo.length;
System.out.print(mediaStipendio);
}}
