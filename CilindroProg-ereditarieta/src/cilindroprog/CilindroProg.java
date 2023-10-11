package cilindroprog;
import java.util.*;

public class CilindroProg {
	
	//Metodo che Arrotonda un numero a 2 cifre decimali con 100.0, a 3 cifre con 1000.0
	public static double Arrotonda(double numero) {
		double n = 0;
		n= Math.round(numero * 100.0) / 100.0;
		return n;
	}
	
    public static void main(String args[]) {
        double Prova=0;
        
        Prova=100.789564321; //Prova del metodo Arrotonda
        System.out.println(Prova);
        Prova=Arrotonda(100.789564321);
        System.out.println(Prova);
        
        //Crea una istanza/oggetto CIL, di classe Cilindro, passando i parametri raggio=4, altezza=10
        //Cilindro CIL = new Cilindro(4,10);
        
    	Cerchio CERC = new Cerchio(4);
        System.out.println("********************************************");          
        System.out.println("DIMENSIONI DEL CERCHIO:");
        System.out.println("Raggio = cm. " 			  + Arrotonda(CERC.getRaggio()));
        System.out.println("Circonferenza = cm. " 	  + Arrotonda(CERC.getCirconferenza()));
        System.out.println("Area del cerchio = cm2. " + Arrotonda(CERC.area()));
        System.out.println("********************************************");  
        
        //Crea una istanza/oggetto CIL, di classe Cilindro, passando i parametri raggio=4, altezza=10
        Cilindro CIL = new Cilindro(4,10);
        
        System.out.println("********************************************");          
        System.out.println("DIMENSIONI DEL CILINDRO:");
        System.out.println("Raggio del cilindro = "  	   + Arrotonda(CIL.getRaggio()));
        System.out.println("Altezza del cilindro = "       + Arrotonda(CIL.getAltezza()));
        System.out.println("Area del cerchio alla base = " + Arrotonda(CIL.area()));
        System.out.println("Area del cilindro = " 	       + Arrotonda(CIL.areaCilindro()));         
        System.out.println("Volume del cilindro = "        + Arrotonda(CIL.volume()));
        System.out.println("********************************************");  

        System.out.println();
        System.out.println("VARIAZIONE DEI PARAMETRI RAGGIO E ALTEZZA");           
        System.out.println();
        
        CIL.setRaggio(7);
        CIL.setAltezza(24);
        
        System.out.println("********************************************");          
        System.out.println("DIMENSIONI DEL NUOVO CILINDRO:");
        System.out.println("Dimensioni del cilindro:");
        System.out.println("Raggio del cilindro = "    + Arrotonda(CIL.getRaggio()));  //Raggio attuale
        System.out.println("Altezza del cilindro = "   + Arrotonda(CIL.getAltezza()));//Altezza attuale
        System.out.println("Area cerchio alla base = " + Arrotonda(CIL.area()));
        System.out.println("Area del cilindro = "      + Arrotonda(CIL.areaCilindro()));         
        System.out.println("Volume del cilindro = "    + Arrotonda(CIL.volume()));
        System.out.println("********************************************");        
    }
}