import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mainnnn {

	public static  void main(String[] args) {
		//arraylist di contatti 
ArrayList <contatto> rubrica = new ArrayList <>();
 //contatto giona = new  contattoAmico("davide", 35265262);
 rubrica.add(new  contattoAmico("davide", 35265262));
 //contatto mion = new  contattoLavoro("andrea", 3524462);
 rubrica.add(new  contattoLavoro("andrea", 3524462));
 for (contatto x: rubrica) {
	System.out.println("nome: " +x.getNome());
	System.out.println("numero di telefono: " +x.getNumTelefono());
	System.out.println("tipo: " +x.getTipologia());
	System.out.println();
 } //ordinate l arraylist
	
	
 Collections.sort(rubrica);

 System.out.println("ordinati :");
 for (contatto x: rubrica) {
     System.out.println(rubrica);
 }
}

}
