package universita;

public class mainStudente {
	public static void main(String[] args) {
studente st1= new studente("mario", "rossi", "1203");
studente st2= new studente("luca", "bianchi", "1554");
studente st3= new studente("anna", "verdi", "5435");

//istanza di corso
corso corso1= new corso("informatica", "prof. mion", 12, 20);
//creare array di studenti che frequenta corso1
studente[] studentiNelCorso = new studente[3];
//popolare 
studentiNelCorso[0]= st1;
studentiNelCorso[1]= st2;
studentiNelCorso[2]= st3;
System.out.println("nome del corso "+ corso1.getNomeCorso());
System.out.println("nome del docente "+ corso1.getDocente());
for (studente x: studentiNelCorso) {
	if (x!=null) {
		System.out.println("cognome studente "+ x.getCognome());	
	}
}}}



