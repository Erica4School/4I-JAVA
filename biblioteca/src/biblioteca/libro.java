package biblioteca;

public class libro {
private String nome;
private int prezzo, quantita;
autore pippo[] = new autore[2];
//costruttore
public libro (String nome, int prezzo, int quantita, autore pippo[]) {
	this.nome=nome;
	this.prezzo=prezzo;
	this.quantita= quantita;
	this.pippo = pippo;
}
//metodo getAutori
public autore[] getAutori() {return pippo;}
}
