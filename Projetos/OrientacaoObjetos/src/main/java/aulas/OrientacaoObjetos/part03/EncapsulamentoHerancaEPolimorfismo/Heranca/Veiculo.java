package aulas.OrientacaoObjetos.part03.EncapsulamentoHerancaEPolimorfismo.Heranca;
/*
* Classe para objetos do tipo veicul, onde serão contidos, valores e métodos para o mesmo.
* @author Roniel Barbosa
* @version 1.0
* @since adicionada em 09/07/2021 na aplicação
* */
public class Veiculo {
    private String modelo;
    private String marca;

    /**
     * Contrutor padrão
     **/

    Veiculo(){
    }
    /**
     * Faz a contrução inicial do obejto Veículo, preenchendo seus atributos.
     * @param modelo  Modelo do veículo
     * @param marca   Marca do velículo
     **/
    Veiculo(final String modelo, final String marca){
        this.modelo = modelo;
        this.marca = marca;
    }

    public String acelerar(){
        return "ACELERANDO!!";
    }

    /**
     * O método realiza o aceso ao atributo modelo e o retorna.
     * @return o modelo do veículo.
    **/
    public String getModelo(){return modelo;}

    /**
     * O método realiza o acesso ao atributo modelo e o modifica.
     * @param modelo   Nome do modelo no formato de String.
     **/
    public void setModelo(final String modelo){this.modelo = modelo;}

    /**
     *O método realiza o acesso ao atributo marca e retorna seu conteúdo.
     * @return a marca do veículo.
     * **/
    public String getMarca(){return marca;}

    /**
     * O método acessa o atributo marva e modifica seu conteúdo.
     * @param marca   Nome da marca no formato de String.
     **/
    public void setMarca(final String marca){this.marca = marca;}

    /**
     * Realiza a formação de luma string formada pelos atributos do objeto.
     * @return Retorna uma string com todos os atributos do veículo
     **/
    @Override
    public String toString(){
        return "Modelo: " + this.getModelo() + " Marca: " + this.getMarca();
    }
}
