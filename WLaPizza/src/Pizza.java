
public abstract class Pizza {
protected String nome, dimensione, farina;
abstract double getCosto();
abstract double getCalorie();
Pizza(String nome, String farina, String dimensione){
	this.nome= nome; 
	this.farina = farina;
	this.dimensione = dimensione;
}
}
