package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        Carro supra=new Carro();
        supra.ano = 94;
        supra.modelo = "MKIV";
        supra.placa ="3NTO305";
        supra.velocidade = 0;

        Radar radar=new Radar();
        radar.localizacao = "Pistão Sul";
        radar.limiteVelocidade = 60;
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
