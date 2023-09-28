
public class Conto {
	
	private double saldo;
	
	public Conto (double saldo) {
		this.saldo = saldo;
	}
	
	public void versa(double quantita) {
		saldo += quantita;
	}
	
	public void preleva(double quantita) {
		saldo -= quantita;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void stampa() {
		System.out.println("Nel conto ci sono €" + saldo);
	}
	
}
