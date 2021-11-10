package one.digitalinovation.abstracts;
//Ela é "uma ideia" de uma classe, não pode ser um obejto
public abstract class FormaGeometrica {
    //se o método é abstrato, só temos a declaração de seu corpo
    public abstract String nome();
    public abstract Double area();

    //método não abstract
    public String desenha(int x, int y){
        return "Desenhando nas coordenadas.";
    }
}
