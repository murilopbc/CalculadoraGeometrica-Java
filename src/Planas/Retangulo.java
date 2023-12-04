package Planas;

public class Retangulo {
    double base, altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularPerimetro(){
        return (2 * this.base) + (2 * this.altura);
    }
    public double calcularArea(){
        return this.base * this.altura;
    }

}
