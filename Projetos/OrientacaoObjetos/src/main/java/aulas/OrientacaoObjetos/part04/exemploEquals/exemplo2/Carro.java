package aulas.OrientacaoObjetos.part04.exemploEquals.exemplo2;

public class Carro extends Veiculo {

    private int quantidadeDePortas;

    Carro(String modelo, String marca, double valorVenal) {
        super(modelo, marca, valorVenal);
    }
    Carro(String modelo, String marca, double valorVenal, int quantidadeDePortas) {
        super(modelo, marca, valorVenal);
        this.quantidadeDePortas = quantidadeDePortas;
    }
    public int getQuantidadeDePortas(){return quantidadeDePortas;}
    public void setQuantidadeDePortas(final int quantidadeDePortas){this.quantidadeDePortas = quantidadeDePortas;}
    public double calculaImposto(){return this.getValorVenal() * 0.07;}
}
