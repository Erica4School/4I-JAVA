
public class Cerchio extends FormaGeometrica {
private double raggio;
Cerchio(double raggio){this.raggio= raggio;}
	@Override
	double calcolaArea() {
		return raggio*raggio*Math.PI;
	}

	@Override
	double calcolaPerimetro() {
		return 2*raggio*Math.PI;
	}
	@Override
	String calcolaVolume() {
		
		return "non ha il volume";
	}
	
	

}
