package Especiais;

public class Cone {
    double raio, altura;

    final double PI = Math.PI;

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double calcularAreaSuperficial(){
        return PI * this.raio * Math.sqrt(Math.pow(this.altura, 2) + Math.pow(this.raio, 2));
    }
    public double calcularVolume(){
        return 0.33 * PI * Math.pow(this.raio, 2) * this.altura;
    }
}
