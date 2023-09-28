
public class sim {
    private double saldo = 0;

    public sim(double saldo) {
this.saldo= saldo;
    }

    public void effettuaRicarica(double importo) {
        saldo += importo;
System.out.println("Ricarica di " + importo + " effettuata con successo.");
}

	public double getSaldo() {
		return saldo;
	}

}
