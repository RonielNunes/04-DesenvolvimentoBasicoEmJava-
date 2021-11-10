package SOLID.SRP.problem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//ALT + ENTER IMPORTA OS MÓDULOS DO JAVA NO intellij
public class OrdemDeCompra {
    private List<SOLID.SRP.solution.Produto> produtos = new ArrayList<>();
    private Object ArrayList;

    public void adicionarProduto(final Produto produto){produto.add(produto);}

    public void removerProduto(final Produto produto){produto.remove(produto);}

    public BigDecimal calcularTotal(){
        //return produtos.stream()
                //.map((SOLID.SRP.solution.Produto t) -> Produto.getValor(t))
                //.reduce(BigDecimal.ZERO, BigDecimal::add);
        return null;
    }
    public List<OrdemDeCompra> buscarOrdemDeCompra(){
        //Retorna a lista de ordem de compra da base de dados
        //return ArrayList<>();
        return null;
    }

    public void alterarOrdemDeCompra(){
        //alterar na base de dados
    }

    public void salvarOrdemCompra(){
        //salva lista de produtos na base de dados.
    }
    public void enviarEmail(final String email){
        //envia um email de compra
    }
    public void imprimeOrdemDeCompra(){
        //imprime a ordem de compra
    }
}

//A classe ficaria muito grande, pois temos diversas implementação de funcionalidades em somente um local. Isso não é uma boa prática,
// a classe deve sempre ter o menor número de linhas possivel para manter uma boa implementação.
