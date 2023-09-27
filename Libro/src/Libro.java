
public class Libro {
private String autore;
private String titolo;
private int pagine;
//costruttore
public Libro (String a, String t, int p) {
	
	this.autore = a;
	this.titolo=t;
	this.pagine= p;
}
public String getAutore() {
	return autore;
}
public String getTitolo() {
	return titolo;
}
public int getPagine() {
	return pagine;
}

public boolean equals(Libro b) {
	return ( this.getAutore().equals(b.getAutore()));
	
}

}
