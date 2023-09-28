package universita;

public class corso {
private String nomeCorso, docente;
private int crediti, numeroMaxStudenti;

corso(String nomeCorso, String docente, int crediti, int numeroMaxStudenti ){
this.nomeCorso= nomeCorso;
this.docente= docente;
this.crediti= crediti;
this.numeroMaxStudenti = numeroMaxStudenti;
}

public String getNomeCorso() {
	return nomeCorso;
}

public void setNomeCorso(String nomeCorso) {
	this.nomeCorso = nomeCorso;
}

public String getDocente() {
	return docente;
}

public void setDocente(String docente) {
	this.docente = docente;
}

public int getCrediti() {
	return crediti;
}

public void setCrediti(int crediti) {
	this.crediti = crediti;
}

public int getNumeroMaxStudenti() {
	return numeroMaxStudenti;
}

public void setNumeroMaxStudenti(int numeroMaxStudenti) {
	this.numeroMaxStudenti = numeroMaxStudenti;
}



}
