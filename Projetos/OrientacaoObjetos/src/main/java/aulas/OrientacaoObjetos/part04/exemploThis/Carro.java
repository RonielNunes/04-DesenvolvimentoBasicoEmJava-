package aulas.OrientacaoObjetos.part04.exemploThis;

public class Carro extends Veiculo{
    private int quantidadeDePortas;
    public int getQuantidadeDePortas(){return quantidadeDePortas;}
    public void setQuantidadeDePortas(final int quantidadeDePortas){this.quantidadeDePortas = quantidadeDePortas;}
    public double calculaImposto(){return this.getValorVenal() * 0.07;}
}
