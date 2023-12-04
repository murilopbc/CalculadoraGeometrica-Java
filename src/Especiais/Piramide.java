package Especiais;

public class Piramide {
    double arestaBase, apotema, altura;

    public Piramide(double arestaBase, double apotema, double altura) {
        this.arestaBase = arestaBase;
        this.apotema = apotema;
        this.altura = altura;
    }
    public double calcularAreaSuperficial(){
        return (2 * arestaBase * apotema) + Math.pow(this.arestaBase, 2);
    }
    public double calcularVolume(){
        return (Math.pow(this.arestaBase, 2) + this.altura) / 3;
    }
}
