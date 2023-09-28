package universita;

public class studente {
private String nome, cognome, matricola;
//costruttore
studente(String nome, String cognome, String matricola){
	this.nome= nome;
	this.cognome= cognome;
	this.matricola= matricola;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCognome() {
	return cognome;
}

public void setCognome(String cognome) {
	this.cognome = cognome;
}

public String getMatricola() {
	return matricola;
}

public void setMatricola(String matricola) {
	this.matricola = matricola;
}

}
