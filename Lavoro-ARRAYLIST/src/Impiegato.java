
public class Impiegato implements Lavoratore{
private String nome;
private double stipendioBase;

Impiegato(String nome, double stipendioBase){
this.nome= nome;
this.stipendioBase = stipendioBase;
}
	@Override
	public double calcolaStipendio() {
		return stipendioBase;
	}

	@Override
	public String getRuolo() {
		
		return "impiegato";
	}

}
