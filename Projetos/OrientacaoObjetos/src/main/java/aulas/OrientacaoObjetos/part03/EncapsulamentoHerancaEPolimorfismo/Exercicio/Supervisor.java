package aulas.OrientacaoObjetos.part03.EncapsulamentoHerancaEPolimorfismo.Exercicio;

public class Supervisor extends Funcionario{

    Supervisor(final String nome, final String CPF, final int idade, final double salario, final double taxa) {
        super(nome, CPF, idade, salario, taxa);
    }

    @Override
    public double imposto() {//0.0005
        return this.getSalario() * this.getTaxa();
    }
}
