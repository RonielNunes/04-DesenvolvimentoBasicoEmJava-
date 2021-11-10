package aulas.OrientacaoObjetos.part03.EncapsulamentoHerancaEPolimorfismo.Exercicio;

public class Atendente extends Funcionario{

    Atendente(final String nome,final String CPF, final int idade,final double salario, final double taxa) {
        super(nome, CPF, idade, salario, taxa);
    }

    @Override
    public double imposto() {//0.0001
        return this.getSalario() * 0.0001;
    }
}
