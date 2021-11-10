package SOLID.SRP.solution;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Clsse ordem de compra
 */
 //Classes implementadas seguindo o princípio da única responsabilidade.

public class OrdemDeCompra{
    private List<Produto> produtos = new ArrayList<>();
    public void adicionarProduto(final Produto produto){produtos.add(produto);}
    public void removerProduto(final Produto produto){produtos.remove(produto);}
    public BigDecimal calcularTotal(){
        //return produtos.stream().map(Produto::getValor).reduce(BigDecimal.ZERO, BigDecimal::add);
        return null;
    }
}

/*
* CLASSE OrdemDeRepository
* */

class OrdemDeRepository{
    public List<OrdemDeCompra>buscaOrdemDeCompra(){
        //retorna a lista de ordens de compra da base de dados
        return new ArrayList<>();
    }
    public void salvarOrdemCompra(final OrdemDeCompra ordemDeCompra){
        //salca lista de produtos na base de dados
    }
    public void alterarOrdemDeCompra(){
        //alterar na base de dados
    }
}

/*
* ClASSE OrdemDeCompraEmail
*  */

class OrdemDeCompraEmail{
    public void enviarEmail(final OrdemDeCompra ordemDeCompra, final String email){

    }
        //envia email da ordem de compra
}

/*
* CLASSE OrdemDeCompraPrint
* */

class OrdemDeCompraPrint{
    public void imprimeOrdemDeCompra(final OrdemDeCompra ordemDeCompra){
        //imprime a ordem de compra
    }

    // Observe que cada classe tem somente uma responsabilidade.
}