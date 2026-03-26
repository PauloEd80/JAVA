import java.sql.SQLOutput;

public class Funcioanrio{
    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;
    boolean estaNaEmpresa;

    void bonifica(double aumento){
        this.salario +=aumento;
    }

    void demite(){
        this.estaNaEmpresa = false;
    }

    void mostrarDados(){
        System.out.println("\n-- Dados do Funcionario--");
        System.out.println("Nome:" = + this.nome);
        System.out.println("Departamento:" + this.departamento);
    }
}
