package Ex02;

public class Loja {
    public static void main(String[] args) {
        Produto[] estoque = new Produto[5];

        estoque[0] = new Livro();
        estoque[1] = new Livro();
        estoque[2] = new CD();
        estoque[3] = new DVD();
        estoque[4] = new DVD();

    }
}