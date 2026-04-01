public class time2 {
    private int hora;    // 0 - 23
    private int minuto;  // 0 - 59
    private int segundo; // 0 - 59

    public time2() {
        this(0, 0, 0);
    }
    public time2(int h) {
        this(h, 0, 0);
    }
    public time2(int h, int m) {
        this(h, m, 0);
    }
    public time2(int h, int m, int s) {
        settime(h, m, s);
    }
    public time2(time2 time) {
        this(time.getHora(), time.getMinuto(), time.getSegundo());
    }
    public void settime(int h, int m, int s) {
        this.hora = ((h >= 0 && h < 24) ? h : 0);
        this.minuto = ((m >= 0 && m < 60) ? m : 0);
        this.segundo = ((s >= 0 && s < 60) ? s : 0);
    }
    public int getHora() { return hora; }
    public int getMinuto() { return minuto; }
    public int getSegundo() { return segundo; }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}