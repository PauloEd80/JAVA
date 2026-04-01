public class Time2Test {
    public static void main(String[] args) {
        time2 t1 = new time2();

        time2 t2 = new time2(20);

        time2 t3 = new time2(20, 45);

        time2 t4 = new time2(t3);

        System.out.println("t1 (hora padrão): " + t1.toUniversalString());
    }
}