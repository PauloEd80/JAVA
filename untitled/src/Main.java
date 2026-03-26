import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criamos um objeto scanner para ler a entrada do terminal
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- EXERCÍCIO 1: MÉDIA ---");
        System.out.print("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("A média é: " + media);

        System.out.println("\n--- EXERCÍCIO 2: CASTING ---");
        System.out.print("Digite um número decimal (ex: 15,9): ");
        double valorDecimal = leitor.nextDouble();
        int valorInteiro = (int) valorDecimal;
        System.out.println("O valor aproximado (inteiro) é: " + valorInteiro);

        System.out.println("\n--- EXERCÍCIO 3: CONCATENAÇÃO ---");
        System.out.print("Digite uma letra (char): ");
        char letra = leitor.next().charAt(0);
        leitor.nextLine(); // Limpeza de buffer
        System.out.print("Digite uma palavra (String): ");
        String palavra = leitor.nextLine();
        System.out.println("Mensagem: A letra escolhida foi " + letra + " e a palavra foi " + palavra);

        System.out.println("\n--- EXERCÍCIO 4: TOTAL DA COMPRA ---");
        System.out.print("Digite o preço do produto: ");
        double precoProduto = leitor.nextDouble();
        System.out.print("Digite a quantidade: ");
        int quantidade = leitor.nextInt();
        double valorTotal = precoProduto * quantidade;
        System.out.println("Total a pagar: R$ " + valorTotal);

        System.out.println("\n--- EXERCÍCIO 5: CONVERSOR DE MOEDA ---");
        System.out.print("Digite o valor em Dólares (US$): ");
        double valorEmDolares = leitor.nextDouble();
        double valorEmReais = valorEmDolares * 4.94;
        System.out.printf("O valor em Reais é: R$ %.2f%n", valorEmReais);

        System.out.println("\n--- EXERCÍCIO 6: CÁLCULO DE DESCONTO ---");
        System.out.print("Digite o preço original do produto: R$ ");
        double precoOriginal = leitor.nextDouble();
        System.out.print("Digite o percentual de desconto (ex: 10): ");
        double percentualDesconto = leitor.nextDouble();
        double valorDesconto = (percentualDesconto / 100) * precoOriginal;
        double precoFinal = precoOriginal - valorDesconto;
        System.out.printf("Desconto: R$ %.2f | Preço Final: R$ %.2f%n", valorDesconto, precoFinal);

        // Fechamos o leitor para boa prática
        leitor.close();
    }
}
