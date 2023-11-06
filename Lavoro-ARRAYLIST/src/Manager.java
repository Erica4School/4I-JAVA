
public class Manager implements Lavoratore{
	private String nome;
	private double stipendioBase;
	private double bonus;
	
	Manager(String nome, double stipendioBase, double bonus){
		this.nome= nome;
		this.stipendioBase = stipendioBase;
		this.bonus = bonus;
		}

	@Override
	public double calcolaStipendio() {
		
		return stipendioBase+bonus;
	}

	@Override
	public String getRuolo() {
		// TODO Auto-generated method stub
		return "manager";
	}
}
