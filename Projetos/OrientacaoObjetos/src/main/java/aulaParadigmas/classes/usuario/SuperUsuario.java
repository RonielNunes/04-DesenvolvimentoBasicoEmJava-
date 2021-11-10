package one.digitalinovation.classes.usuario;

public class SuperUsuario {
    private String login; //Não são acessíveis fora dessa classe
    private String senha;
    //default, acesso sem restrição no mesmo pacote
    String nome;

    public SuperUsuario(final  String login, final String senha){
        this.login = login;
        this.senha = senha;
    }
    //sempre tem acesso
    public String getLogin(){
        return login;
    }

    //Acesso pois estão no mesmo pacote
    protected String getSenha(){
        return senha;
    }

}
