package SOLID.LSP.problem;

public class Retangulo {
    private double altura;
    private double largura;

    public double getAltura(){
        return altura;
    }
    public void setAltura(final double altura){
        this.altura = altura;
    }
    public double getLargura(){
        return largura;
    }
    public void setLargura(final double largura){
        this.largura = largura;
    }

    public double getArea(){
        return altura * largura;
    }
}
