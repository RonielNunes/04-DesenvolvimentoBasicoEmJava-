package aulas.OrientacaoObjetos.part01.paradigma.exemplo001.Exercicio01;

public class ProgramaCarro {
    public static void main(String[] args){
        Carro carro = new Carro(0,5);
        System.out.println("Adicionado? " + carro.adicionarOcupante(4));
        System.out.println("Removido? " + carro.removerOcupante(2));
        System.out.println(carro.toString());
    }
}
