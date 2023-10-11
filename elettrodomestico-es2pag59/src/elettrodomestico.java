
public class elettrodomestico {
    protected String tipo, detersivo;
protected int quantita, carico;

    public elettrodomestico(String tipo, String detersivo,  int quantita, int carico) {
this.tipo = tipo; this.detersivo=detersivo;
this.quantita = quantita; this.carico= carico;

    }

    public void Lavaggio() {
        // Implementa il programma di lavaggio generico
System.out.println("Avvio del programma di lavaggio generico per " + tipo);
}
    void ferma(int minuti) {
    	if (minuti>180) 
    		System.out.println("il programma si è sospeso definitivamente");
    	else System.out.println("il programma si è sospeso temporanemante per minuti "+ minuti);
    }

}
