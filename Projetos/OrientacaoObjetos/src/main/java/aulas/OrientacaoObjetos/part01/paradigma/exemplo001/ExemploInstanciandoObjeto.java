package aulas.OrientacaoObjetos.part01.paradigma.exemplo001;

public class ExemploInstanciandoObjeto {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Leinor");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.falarMeuNome());
        System.out.println(pessoa.andar());
    }
}
