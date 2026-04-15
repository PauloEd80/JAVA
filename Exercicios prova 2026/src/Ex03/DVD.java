package Ex03;

public class DVD extends Produto {
    private int duracao;

    public DVD() {}

    public DVD(String nome, double preco, String codigoDeBarras, int duracao) {
        super(nome, preco, codigoDeBarras);
        this.duracao = duracao;
    }

    public int getDuracao() { return duracao; }
    public void setDuracao(int duracao) { this.duracao = duracao; }

    @Override
    public String toString() {
        return "DVD [" + super.toString() + ", Duração: " + duracao + " min]";
    }
}

