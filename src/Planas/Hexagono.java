package Planas;

public class Hexagono {
    double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro(){
        return this.lado * 6;
    }

    public double calcularArea(){
        return this.lado * 6 * Math.sqrt(0.75);
    }
}
