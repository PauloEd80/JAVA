package Ex01;

import java.sql.SQLOutput;

public class Amigo extends Pessoa {
    private String diaDoAniversario; //13/08/1998
// construtor vazio
    public Amigo() {}
// construtor que tem tudo
    public Amigo(String nome, char sexo, int idade, String diaDoAniversario) {
        super(nome, sexo, idade);
        this.diaDoAniversario = diaDoAniversario;
    }

    public String getDiaDoAniversario() {
        return diaDoAniversario;
    }
    public void setDiaDoAniversario(String diaDoAniversario) {

        this.diaDoAniversario = diaDoAniversario;
    }

    @Override
    public String toString() {

        return "Amigo [diaDoAniversario=" + diaDoAniversario + ", " + super.toString() + "]";
    }
    //teste rapido
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Carlos", 'M', 30);
        System.out.println(p);

        Amigo a = new Amigo("Ana", 'F', 19, "04/05/2006");
        System.out.println(a);
    }
    }


