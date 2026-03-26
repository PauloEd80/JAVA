import java.util.Scanner;

public class AulaArrays {
    public static void main(String[] args) {
        // Criando um array de 4 posições (índices 0 a 3)
        double[] temperaturas = new double[4];

        temperaturas[0] = 30.5;
        temperaturas[1] = 28.0;
        temperaturas[2] = 29.5;
        temperaturas[3] = 31.2;

        // temperaturas[4] = 30.0; // ERRO! Estoura o limite.

        // Iterando (Percorrendo) o array
        // Note o uso de .length - Em C isso não existe nativamente no vetor
        System.out.println("Histórico de Temperaturas:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Dia " + (i+1) + ": " + temperaturas[i]);
        }
    }
}