package aulas.OrientacaoObjetos.part01.paradigma.exemplo001;
//Classe molde de um objeto ou entidade
public class Pessoa {
    //Atributos da classe, são as características que à define.
    private String nome;

    //Métodos construtores
    //Aplicação de sobrecarga, métodos de mesmo nome com parâmetros diferentes.
    public Pessoa(){}; //Possibilita dois modos de instânciação
    public Pessoa(String nome){
        this.nome = nome;
    }
    //Métodos get and set, são métodos para acessar e poder
    //modificar as características de um objetos ou consultalas.
    public String getNome() {
        return nome;
    } //Métodos normalmente são públicos.
    public String falarMeuNome(){
        return "Olá, meu nome é " + getNome();
    }
    public String andar(){
        return "Estou andando!";
    }
}
