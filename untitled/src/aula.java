import java.util.Scanner; // Importando a ferramenta de leitura

public class aula {
    public static void main(String[] args) {

        // 1. CONFIGURAÇÃO INICIAL (Nossas "Regras do Mundo")
        // O Scanner é o objeto que vai ler o teclado (System.in)
        Scanner leitor = new Scanner(System.in);

        final double ALTURA_MAXIMA = 2.10; // 'final' significa que é uma constante
        final String SENHA_CORRETA = "java123";

        System.out.println("--- SISTEMA DE GARAGEM INTELIGENTE ---");

        // 2. COLETA DE DADOS (Entradas)

        System.out.print("Digite a altura do veículo (ex: 1.80): ");
        double alturaVeiculo = leitor.nextDouble();

        System.out.print("Digite a idade do tripulante principal: ");
        int idadeTripulante = leitor.nextInt();

        System.out.print("Digite a senha de acesso: ");
        // Usamos .next() para ler uma palavra (sem espaços)
        String senhaDigitada = leitor.next();


        // 3. PROCESSAMENTO LÓGICO (O Cérebro do programa)

        // A. Verificação de Altura (Gera um booleano)
        boolean isAlturaAdequada = alturaVeiculo <= ALTURA_MAXIMA;

        // B. Verificação de Senha (Gera um booleano)
        // LEMBRE-SE: String usa .equals(), nunca ==
        boolean isSenhaValida = senhaDigitada.equals(SENHA_CORRETA);

        // C. Classificação Etária (Apenas informativa)
        String categoriaIdade;
        if (idadeTripulante < 12) {
            categoriaIdade = "Criança (Atenção: Não deveria estar dirigindo!)";
        } else if (idadeTripulante < 18) {
            categoriaIdade = "Adolescente";
        } else if (idadeTripulante < 60) {
            categoriaIdade = "Adulto";
        } else {
            categoriaIdade = "Idoso";
        }

        // 4. SAÍDA DE DADOS E DECISÃO FINAL

        System.out.println("\n--- RELATÓRIO DE ACESSO ---");
        System.out.println("Classificação do Tripulante: " + categoriaIdade);
        System.out.println("Altura permitida? " + isAlturaAdequada);
        System.out.println("Senha correta? " + isSenhaValida);

        System.out.println("---------------------------");

        // Lógica Final: Só entra se Altura OK **E** Senha OK
        if (isAlturaAdequada && isSenhaValida) {
            System.out.println("✅ ACESSO LIBERADO! Bem-vindo.");
        } else {
            System.out.println("❌ ACESSO NEGADO.");

            // Feedback detalhado do motivo da negação
            if (!isAlturaAdequada) {
                System.out.println("Motivo: Veículo muito alto para o teto da garagem.");
            }
            if (!isSenhaValida) {
                System.out.println("Motivo: Senha incorreta.");
            }
        }

        // Boa prática: fechar o scanner para liberar recursos
        leitor.close();
    }
}