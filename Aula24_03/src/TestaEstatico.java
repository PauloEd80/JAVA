public class TestaEstatico {
    public static void main(String[] args) {
        Estatico e1 = new Estatico();
        Estatico e2 = new Estatico();
        Estatico e3 = new Estatico();
        System.out.println("Valor = " + e1.getValor());
        e1.valor++;
        System.out.println("Valor = " + e1.getValor());
        e2.valor++;
        System.out.println("Valor = " + e1.getValor());
    }
}
