package Planas;

import javax.swing.*;

public class Quadrado {
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro(){
        return this.lado * 4;
    }

    public double calcularArea(){
        return Math.pow(this.lado, 2);
    //  Math.pow é uma função que serve para elevar números.
    }

}
