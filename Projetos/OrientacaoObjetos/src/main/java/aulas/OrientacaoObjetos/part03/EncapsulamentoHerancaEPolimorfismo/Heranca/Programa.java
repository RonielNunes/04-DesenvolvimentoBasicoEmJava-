package aulas.OrientacaoObjetos.part03.EncapsulamentoHerancaEPolimorfismo.Heranca;

public class Programa {
    public static void main(String[] args) {
        Motocicleta moto = new Motocicleta("XL 1200","HARLEY DAVIDSON","1200");
        System.out.println("MOTO: " + moto.toString());
        Carro carro = new Carro("FERRARI-234","FERRARI", 2);
        System.out.println("CARRO: " + carro.toString());

        System.out.println();

        Motocicleta motocicleta = new Motocicleta();
        Carro carroNovo = new Carro();
        System.out.println(motocicleta.toString());
        System.out.println(carroNovo.toString());

        motocicleta.setModelo("h2");
        motocicleta.setMarca("Kawaseki");
        motocicleta.setCilindradas("1200");

        carroNovo.setModelo("Fiat");
        carroNovo.setMarca("Uno mili");
        carroNovo.setQuantidadeDePortas(4);
        System.out.println(motocicleta.toString());
        System.out.println(carroNovo.toString());

        System.out.println(carroNovo.acelerar());
        System.out.println(motocicleta.acelerar());

    }
}
