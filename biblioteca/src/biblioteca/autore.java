package biblioteca;

public class autore {
private String nome, email;
private char genere;

autore(String nome, String email, char genere){
	this.nome= nome;
	this.email= email;
	this.genere= genere;
}

@Override
public String toString() {
	return "autore [nome=" + nome + ", email=" + email + ", genere=" + genere + "]";
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public char getGenere() {
	return genere;
}

public void setGenere(char genere) {
	this.genere = genere;
}
}
