
public class cilindro extends Cerchio {
	private double altezza;
	cilindro(double raggio, double altezza) {
		super(raggio);
		this.altezza = altezza;
	}
	@Override
	double calcolaArea() {
		return super.calcolaArea();
	}
	
	@Override
	String calcolaVolume() {
		return "il volume è"+(super.calcolaArea() * altezza);
	}
	

	

	
}
