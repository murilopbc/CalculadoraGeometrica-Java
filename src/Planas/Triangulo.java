package Planas;

public class Triangulo {
    double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro(){
        return this.lado * 3;
    }

    public double calcularArea(){
        return this.lado * Math.sqrt(0.75);
    }

}