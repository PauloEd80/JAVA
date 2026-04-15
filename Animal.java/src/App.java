public class App {
    public static void main(String[] args){
        Animal cavalo = new Animal("Pé de pano", 420.0f, 1);
        cavalo.andar();
        System.out.println(cavalo.toString());

        Ave papagaio = new Ave("Loro", 0.5f,3, "Floresta Amazonica", true);
        papagaio.andar();
        System.out.println(papagaio.toString());

        Ave avestruz = new Ave("avestruz", 2);
        avestruz.setPeso(140.0f);
        avestruz.setLocal("Quintal");
        avestruz.setMigracao(false);
        avestruz.andar();
        System.out.println(avestruz);

    }
}