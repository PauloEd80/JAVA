package Ex03;

public class Produto {
    private String nome;
    private double preco;
    private String codigoDeBarras; // obrigatório no construtor

    public Produto() {}

    public Produto(String nome, double preco, String codigoDeBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public String getCodigoDeBarras() { return codigoDeBarras; }
    public void setCodigoDeBarras(String codigoDeBarras) { this.codigoDeBarras = codigoDeBarras; }


}
