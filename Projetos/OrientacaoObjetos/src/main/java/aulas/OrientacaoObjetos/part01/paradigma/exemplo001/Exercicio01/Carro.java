package aulas.OrientacaoObjetos.part01.paradigma.exemplo001.Exercicio01;

public class Carro {
    private Integer quantidadeDeOcupantes;
    private Integer max;

    //Aqui podemos ver unboxing e boxing
    //Lembrete:
    //Autoboxing Wrapper recebe Wrapper = tipo recebe o tipo
    //Unboxing Obejto recebe um tipo primitivo
    public Carro(int quantidadeDeOcupantes, int max){
        this.quantidadeDeOcupantes = quantidadeDeOcupantes;
        this.max = max;
    }

    public boolean adicionarOcupante(int numeroDeOcupantes){
        if(max - quantidadeDeOcupantes > 0 && quantidadeDeOcupantes + numeroDeOcupantes <= max){
            this.quantidadeDeOcupantes = numeroDeOcupantes;
            return true; //adicionado
        }
        return false;
    }
    public boolean removerOcupante(int numeroDeOcupante){
        if (quantidadeDeOcupantes >= numeroDeOcupante) {
            this.quantidadeDeOcupantes -= numeroDeOcupante;
            return true;
        }else{
            quantidadeDeOcupantes = 0;
            return false;
        }
    }
    @Override
    public String toString(){
        return "Max: " + max + " Ocupantes: " + quantidadeDeOcupantes;
    }
}
