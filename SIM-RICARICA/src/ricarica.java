
public class ricarica {
    private double importo;
    private String data;

    public ricarica(double importo, String data) {
this.importo = importo;
this.data = data;
}

    public double getImporto() {
        return importo;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Importo: " + importo + ", Data: " + data;
    }

}
