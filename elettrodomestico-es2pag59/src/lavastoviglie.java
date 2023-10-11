
public class lavastoviglie extends elettrodomestico {

	public lavastoviglie(String tipo, String detersivo, int quantita, int carico) {
		super(tipo, detersivo, quantita, carico);
		// TODO Auto-generated constructor stub
	}

	//polimorfismo
		public void Lavaggio(int carico) {
			
			super.Lavaggio();
		
			if (carico< 4) {
				  System.out.println("solo bicchieri");
				} else if (carico< 10) {
				  System.out.println("piatti e bicchieri con risciacquo");
				} else {
				  System.out.println("lavaggio automatico");
				}
		}}