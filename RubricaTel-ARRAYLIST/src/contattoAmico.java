
public class contattoAmico extends contatto{
	contattoAmico(String nome, int numTelefono) {
		super(nome, numTelefono);
	
	}

	@Override
	String getTipologia() {
		return "amico";
	}
}
