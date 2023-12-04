package Especiais;

public class Esfera {
    double raio;
    final double PI = Math.PI;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double calcularAreaSuperficial(){
        return (PI * 4) * Math.pow(this.raio, 2);
    }
    public double calcularVolume(){
        return (1.33 * PI) * Math.pow(this.raio, 3);
    }
}
