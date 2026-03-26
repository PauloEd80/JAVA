import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta minhaConta = new Conta();

        System.out.print("Informe o nome do titular da conta: ");
        minhaConta.titular = scan.nextLine();

        System.out.print("informe o valor a ser depositado: ");
        double valorInicial = scan.nextDouble();

        minhaConta.saldo = valorInicial;

        minhaConta.depositar(valorInicial);

        System.out.println("Titular: " + minhaConta.titular);
        System.out.println("Saldo atual: R$ " + minhaConta.getSaldo());

        scan.close();
    }
}