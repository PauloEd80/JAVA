public class time1Test {
    public static void main(String[] args) {
        time1 time = new time1();

        System.out.print("O tempo universal inicial é: ");
        System.out.println(time.toUniversalString());

        System.out.print("O tempo padrão inicial é: ");
        System.out.println(time.toString());

        System.out.println();

        //Altera a hora e gera saidas atualizadas
        time.setTime(13, 27, 6);

        System.out.print("O tempo universal após o setTime é: ");
        System.out.println(time.toUniversalString());

        System.out.print("O tempo padrão após o setTime é: ");
        System.out.println(time.toString());

        System.out.println();
    }
}