package aulas.OrientacaoObjetos.part03.EncapsulamentoHerancaEPolimorfismo.Exercicio;

public class Gerente extends Funcionario{

    Gerente(final String nome,final String CPF, final int idade,final double salario, final double taxa) {
        super(nome, CPF, idade, salario, taxa);
    }

    @Override
    public double imposto() {//0.001
        return this.getSalario() * this.getTaxa();
    }

}
