package Especiais;

public class Cubo {
    double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }
    public double calcularAreaSuperficial(){
        return Math.pow(this.lado, 2) * 6;
    }
    public double calcularVolume(){
        return Math.pow(this.lado, 3);
    }
}
