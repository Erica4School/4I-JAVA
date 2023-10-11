
public class bici {
private int velocita;
public int corona;
bici(int corona, int velocita){
	this.corona= corona;
	this.velocita= velocita;
}
void frena(int decremento) {velocita-= decremento;
System.out.println("ho frenato e ora corro a km/h " + velocita);
}
void accellera(int incremento) {velocita-= incremento;
System.out.println("ho accellerato e ora corro a km/h " + velocita);
}
@Override
public String toString() {
	return "bici [velocita=" + velocita + ", corona=" + corona + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";
}

}
