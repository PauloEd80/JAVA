package Ex03;

public class CD extends Produto {
    private int numeroDeFaixas;

    public CD() {}

    public CD(String nome, double preco, String codigoDeBarras, int numeroDeFaixas) {
        super(nome, preco, codigoDeBarras);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public int getNumeroDeFaixas() { return numeroDeFaixas; }
    public void setNumeroDeFaixas(int numeroDeFaixas) { this.numeroDeFaixas = numeroDeFaixas; }

    @Override
    public String toString() {
        return "CD [" + super.toString() + ", Faixas: " + numeroDeFaixas + "]";
    }
}