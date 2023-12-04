package Especiais;

public class Cilindro {
    double raio, altura;

    final double PI = Math.PI;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double calcularAreaSuperficial(){
        return (2 * PI * this.raio * this.altura) + (2 * PI * Math.pow(this.raio, 2));
    }

    public double calcularVolume(){
        return PI * this.altura * Math.pow(this.raio, 2);
    }

}
