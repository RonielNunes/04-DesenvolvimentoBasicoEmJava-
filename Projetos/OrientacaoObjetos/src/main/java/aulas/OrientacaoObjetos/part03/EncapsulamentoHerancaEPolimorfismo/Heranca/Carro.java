package aulas.OrientacaoObjetos.part03.EncapsulamentoHerancaEPolimorfismo.Heranca;
/**
 * Classe para objetos do tipo Carro, onde contém os métodos e atributos para compor esse objeto.
 * @autor Roniel Barbosa
 * @version 1.0
 * @since adicionado em 09/07/2021 na aplicação
 **/
public class Carro extends Veiculo{
    private Integer quantidadeDePortas;

    /**
     * Construtor padrão
     **/
    Carro(){

    }
    /**
     * Faz a contrução inicial do objeto Carro, preenchendo seus atributos.
     * @param modelo Modelo do veículo
     * @param marca Marca do veículo
     **/
    Carro(final String modelo, final String marca, final int quantidadeDePortas){
        super(modelo,marca); //Construtor da super classe
        this.quantidadeDePortas = quantidadeDePortas; //Unboxing Objeto recebendo tipo primitivo
    }

    public Integer getQuantidadeDePortas() {
        return quantidadeDePortas;
    }
    public void setQuantidadeDePortas(final int quantidadeDePortas){
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public String toString(){
        return super.toString() + " Quantidade De Portas: " + getQuantidadeDePortas();
    }
}
