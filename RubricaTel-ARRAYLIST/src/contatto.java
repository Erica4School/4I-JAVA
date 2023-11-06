
public abstract class contatto {
private String nome;
private int numTelefono;
public String getNome() {
	return nome;
}
public int getNumTelefono() {
	return numTelefono;
}
contatto(String nome, int numTelefono){
	this.nome= nome;
	this.numTelefono= numTelefono;
}
abstract String getTipologia();
}
