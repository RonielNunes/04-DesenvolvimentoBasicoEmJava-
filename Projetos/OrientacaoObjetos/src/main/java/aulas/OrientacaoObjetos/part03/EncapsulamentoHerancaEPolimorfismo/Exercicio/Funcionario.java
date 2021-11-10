package aulas.OrientacaoObjetos.part03.EncapsulamentoHerancaEPolimorfismo.Exercicio;

//Classe abstract não podemos instanciar. Obs: toda classe que extends ela tem que implementar os métodos abstratos.
public abstract class Funcionario {
    private String nome;
    private String CPF;
    private Integer idade;
    private Double salario;
    private Double taxa;

    Funcionario(final String nome,final String CPF, final int idade, final double salario, final double taxa){
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.salario = salario;
        this.taxa = taxa;
    }
    public double getSalario(){
        return salario;
    }
    public double getTaxa(){
        return taxa;
    }

    //Métodos abstratos recebem são programados somente seus cabeçalhos.
    public abstract double imposto();

    @Override
    public String toString(){
        StringBuilder texto = new StringBuilder();
        texto.append("\nInformacoes do funcionario: \n");
        texto.append("Nome: " + nome + "\n");
        texto.append("CPF: " + CPF + "\n");
        texto.append("Idade: " + idade + "\n");
        texto.append("Salario: " + salario + "\n");
        return texto.toString();
    }

}
