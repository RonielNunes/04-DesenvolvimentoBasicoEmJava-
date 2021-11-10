package one.digitalinovation.classes.pessoa;

public class ProgramaPessoaFisica {
    public static void main(String[] args) {
        final PessoaFisica pessoaFisica = new PessoaFisica(33,80.5f);
        System.out.println(pessoaFisica.relatorio());
    }
}
