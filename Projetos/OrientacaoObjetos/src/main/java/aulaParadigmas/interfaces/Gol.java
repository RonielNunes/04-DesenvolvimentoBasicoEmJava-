package aulaParadigmas.interfaces;

public class Gol implements Carro{
    //Quando uma classe implementa uma interface
    //ela se "torna" a interface. Ou seja, gol é um carro.
    //Obrigado a implementar todos os métodos públicos
    //Os default não precisam
    @Override
    public String marca() {
        return "Volkswagen";
    }

    @Override
    public Double valor() {
        return null;
    }
}
