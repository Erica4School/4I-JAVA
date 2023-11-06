
public class contattoLavoro extends contatto {

	contattoLavoro(String nome, int numTelefono) {
		super(nome, numTelefono);
	
	}

	@Override
	String getTipologia() {
		return "lavoro";
	}

}
