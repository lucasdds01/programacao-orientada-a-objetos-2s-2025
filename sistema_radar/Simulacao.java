package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        Carro supra=new Carro("3NTO305", 0, 94, "MKIV");

        Radar radar=new Radar("Pistão Sul", 60);
        radar.avaliarVelocidade(supra);

        supra.acelerar();
        supra.acelerar();
        supra.acelerar();
        supra.acelerar();
        supra.acelerar();
        supra.acelerar();
        supra.acelerar();
        radar.avaliarVelocidade(supra);
    }
}
