
class Conta {

    double saldo;
    public String titular;
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
}