package esRip;

public class studente {
    private String cognome;
    private int eta;
    private String corso;

    public studente(String cognome, int eta, String corso) {
        this.cognome = cognome;
this.eta = eta;
this.corso = corso;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

    public String getCourse() {
        return corso;
    }

    public String toString() {
        return "cognome: " + cognome + ", età: " + eta + ", corso: " + corso;
    }


}
