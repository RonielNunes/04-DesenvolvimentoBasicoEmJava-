package aulaParadigmas.interfaces;

public interface Carro extends Automovel{

    String marca(); //Método abstrato, modificador de acesso é poublic como padrão

    Double valor();

    //Método default, não quebra implemetanção
    default void ligar() {
        System.out.println("Ligando o carro!");
    }

    default String codigoRenavan() {
        return "6533jijiio";
    }

}