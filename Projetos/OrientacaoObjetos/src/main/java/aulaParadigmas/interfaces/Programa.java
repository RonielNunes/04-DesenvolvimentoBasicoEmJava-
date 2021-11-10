package aulaParadigmas.interfaces;

public class Programa {
    public static void main(String[] args) {
        //Um Gol é um carro, final Gol gol = new Gol();
        final Carro gol = new Gol();
        System.out.println("Marca do Gol : "+gol.marca());
        gol.ligar(); //Método defautl de um carro

        final Veiculo trator = new Trator();
        System.out.println("Registro do Trator :"+trator.registro());
        trator.ligar(); //Método default de um veículo

        //Fiesta implementa um carro e veículo. Logo, não podemos
        //Fazer casting Ex.: final Veiculo fiesta = new Fiesta() ou
        //final final Carro fiesta = new fiesta();
        final Fiesta fiesta = new Fiesta();
        //Obs: o fiesta teve que sobrescresver o método ligar,
        //pois esse método aparece em ambas as interfaces. No entanto,
        //Sua sobrescrição foi chama-los individualmente
        // Carro.super.ligar(); e Veiculo.super.ligar(), ambos os métodos
        //são default.
        System.out.println("Marca do Fiesta : "+fiesta.marca());
        System.out.println("Registro do Fiesta : "+fiesta.registro());

        fiesta.ligar();

        //Carro.super.ligar(); //só pode ser acessado por que implementa
    }
}
