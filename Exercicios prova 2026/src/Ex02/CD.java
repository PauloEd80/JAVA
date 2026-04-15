package Ex02;

public class CD extends Produto {
    private int numeroDeFaixas;

    public CD() {}

    public CD(String nome, double preco, int numeroDeFaixas) {
        super(nome, preco);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public int getNumeroDeFaixas() { return numeroDeFaixas; }
    public void setNumeroDeFaixas(int numeroDeFaixas) { this.numeroDeFaixas = numeroDeFaixas; }

    @Override
    public String toString() {
        return "CD [" + super.toString() + ", Faixas: " + numeroDeFaixas + "]";
    }
}