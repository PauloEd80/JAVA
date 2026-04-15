package Ex03;

public class Loja {

    public static int buscarProduto(Produto produto, Produto[] estoque) {
        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i].equals(produto)) {
                return i;
            }
        }
        return -1;
    }

    public static void imprimirResultadoBusca(Produto produto, Produto[] estoque) {
        int posicao = buscarProduto(produto, estoque);
        if (posicao >= 0) {
            System.out.println("Produto encontrado na posição " + posicao + ": " + estoque[posicao]);
        } else {
            System.out.println("Produto NÃO encontrado no estoque. Cód.Barras buscado: "
                    + produto.getCodigoDeBarras());
        }
    }

    public static void main(String[] args) {
        // Montando o estoque com códigos de barras
        Produto[] estoque = new Produto[5];
        estoque[0] = new Livro("O Senhor dos Anéis", 79.90, "COD", "J.R.R. Tolkien");
        estoque[1] = new Livro("Clean Code", 89.90, "COD", "Robert C. Martin");
        estoque[2] = new CD("Thriller", 39.90, "COD", 9);
        estoque[3] = new DVD("Matrix", 29.90, "COD", 136);
        estoque[4] = new DVD("Interestelar", 34.90, "COD", 169);

        // Imprimindo o estoque
        System.out.println("=== Estoque da Loja ===");
        for (Produto p : estoque) {
            System.out.println(p);
        }

        System.out.println("\n=== Teste de Busca ===");

        // Produto escolhido: Matrix (posição 3, COD004)
        // Instância com o MESMO código de barras — deve ser encontrada
        DVD matrizMesmoCod = new DVD("Matrix", 29.90, "COD004", 136);

        // Instância com código de barras DIFERENTE — não deve ser encontrada
        DVD matrizCodDiferente = new DVD("Matrix", 29.90, "COD999", 136);

        System.out.println("Busca com mesmo código de barras (COD004):");
        imprimirResultadoBusca(matrizMesmoCod, estoque);

        System.out.println("\nBusca com código de barras diferente (COD999):");
        imprimirResultadoBusca(matrizCodDiferente, estoque);
    }
}