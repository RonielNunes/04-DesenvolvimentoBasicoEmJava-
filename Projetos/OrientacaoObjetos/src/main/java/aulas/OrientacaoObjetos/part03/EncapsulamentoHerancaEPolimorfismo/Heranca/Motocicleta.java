package aulas.OrientacaoObjetos.part03.EncapsulamentoHerancaEPolimorfismo.Heranca;
/**
 * Classe para objetos do tipo Motocicleta, onde contém os métodos e atributos para compor esse objeto.
 * @autor Roniel Barbosa
 * @version 1.0
 * @since adicionado em 09/07/2021 na aplicação
 **/
public class Motocicleta extends Veiculo{
    private String cilindradas;

    Motocicleta(){

    }

    Motocicleta(final String modelo, final String marca, final String cilindradas) {
        super(modelo, marca); //Construtor da classe Veiculo
        this.cilindradas = cilindradas;
    }

    public void setCilindradas(final String cilindradas){
        this.cilindradas = cilindradas;
    }
    public String getCilindradas(){
        return cilindradas;
    }

    @Override
    public String toString(){
        return super.toString() + " Cilindradas: " + getCilindradas();
    }
}
