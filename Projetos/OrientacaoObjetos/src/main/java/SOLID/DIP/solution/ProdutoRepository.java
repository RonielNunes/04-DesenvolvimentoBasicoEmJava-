package SOLID.DIP.solution;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
    private DbConnection dbConnection;

    public ProdutoRepository(final DbConnection dbConnection){ //Melhor forma com injeção de dependência
        this.dbConnection = dbConnection;
    }

    public List<Produto> buscaProduto(){
       return new ArrayList<>();
    }
    public void salvarProduto(final Produto produto){
        //salva produto na base de dados.
    }
}
