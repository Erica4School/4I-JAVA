
public class Bici implements Veicolo {
private int velocita;
Bici(int velocita){this.velocita=velocita;}
@Override
public void accelerare(int valore) {
velocita += valore;
System.out.println("la bici sta accelerando di  "+ velocita);
}

@Override
public void decelerare(int valore) {
	velocita -= valore;
	System.out.println("la bici sta decelerando di  "+ velocita);
	
}
@Override
public void fermarsi() {
	velocita=0;
	System.out.println("la bici si è fermata");

	
}
}
