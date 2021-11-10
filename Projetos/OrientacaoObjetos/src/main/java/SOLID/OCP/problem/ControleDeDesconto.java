package SOLID.OCP.problem;

public class ControleDeDesconto {
    public void adicionaDescontoLivroInfanatil(final DescontoLivroInfantil descontoLivroInfantil){
        descontoLivroInfantil.valorDescontoLivroInfantil();
    }

    public void adicionaDescontoLivroAutoAjuda(final DescontoLivroAutoAjuda descontoLivroAutoAjuda){
        descontoLivroAutoAjuda.valorDescontoAutoAjuda();
    }

    public void adicionaDescontoLivroAcao(final DescontoLivroAcao descontoLivroAcao){
        descontoLivroAcao.descontoLivroAcao();
    }
}
