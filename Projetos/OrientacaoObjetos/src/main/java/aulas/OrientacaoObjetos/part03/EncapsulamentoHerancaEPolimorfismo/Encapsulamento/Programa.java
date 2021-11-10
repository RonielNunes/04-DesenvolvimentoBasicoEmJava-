package aulas.OrientacaoObjetos.part03.EncapsulamentoHerancaEPolimorfismo.Encapsulamento;


public class Programa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Poly",1998,11,30);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.idade());
        System.out.println(pessoa.getDataNascimento());

    }

}
