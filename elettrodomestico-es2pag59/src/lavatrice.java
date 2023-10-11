
public class lavatrice extends elettrodomestico  {

	public lavatrice(String tipo, String detersivo, int quantita, int carico) {
		super(tipo, detersivo, quantita, carico);
		// TODO Auto-generated constructor stub
	}

	//polimorfismo
	public void Lavaggio(int carico) {
		
		super.Lavaggio();
	
		if (carico< 10) {
			  System.out.println("capi leggeri");
			} else if (carico< 18) {
			  System.out.println("capi pesanti da centrifugare");
			} else {
			  System.out.println("lavaggio automatico");
			}
	}

	
	

   

}
