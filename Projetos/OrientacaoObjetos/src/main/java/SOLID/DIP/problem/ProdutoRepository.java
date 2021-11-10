package SOLID.DIP.problem;


import SOLID.DIP.solution.MySqlConnection;
import SOLID.DIP.solution.Produto;

import java.util.List;

public class ProdutoRepository {
    private MySqlConnection mySqlConnection;

    //public ProdutoRepository(){
    //    this.mySqlConnection = new MySqlConnection();
    //} Forma ruim

    public ProdutoRepository(final MySqlConnection mySqlConnection){ //Melhor forma com injeção de dependência
        this.mySqlConnection = mySqlConnection;
    }

    public List<SOLID.DIP.solution.Produto> buscaProduto(){
        //retorna a list de produto da base de dados
        //return new ArrayList<>();
        return null;
    }
    public void salvarProduto(final Produto produto){
        //salva produto na base de dados.
    }
}
