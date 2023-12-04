package Especiais;

public class Paralelepipedo {
    double comprimento, altura, largura;

    public Paralelepipedo(double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }
    public double calcularAreaSuperficial(){
        return 2 * ((this.comprimento * this.altura) + (this.altura * this.largura) + (this.comprimento * this.largura));
    }
    public double calcularVolume(){
        return this.comprimento * this.largura * this.altura;
    }
}
