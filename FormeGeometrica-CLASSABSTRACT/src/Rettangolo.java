
public class Rettangolo extends FormaGeometrica{
private double larghezza, lunghezza;
Rettangolo(double larghezza, double lunghezza){this.larghezza = larghezza; this.lunghezza= lunghezza;}
	@Override
	double calcolaArea() {
		return larghezza*lunghezza;
	}

	@Override
	double calcolaPerimetro() {
		return (larghezza+lunghezza)*2;
	}
	@Override
	String calcolaVolume() {
		// TODO Auto-generated method stub
		return "non ha il volume";
	}

}
