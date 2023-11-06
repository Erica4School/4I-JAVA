
public class Operaio implements Lavoratore{
	private String nome;
	private double stipendioOrario;
	private int oreLavoro;
	
	Operaio (String nome, double stipendioOrario, int oreLavoro){
		this.nome= nome;
		this.stipendioOrario = stipendioOrario;
		this.oreLavoro = oreLavoro;
		}
	
	
	@Override
	public double calcolaStipendio() {	
		return stipendioOrario*oreLavoro;
	}

	@Override
	public String getRuolo() {
		return "operai";
	}

}
