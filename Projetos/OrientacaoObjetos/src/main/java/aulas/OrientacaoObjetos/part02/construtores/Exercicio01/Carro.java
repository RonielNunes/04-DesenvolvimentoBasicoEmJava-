package aulas.OrientacaoObjetos.part02.construtores.Exercicio01;

public class Carro {
    private String marca;
    private String modelo;
    private Integer ano;
    private String variante;

    Carro(){ }
    Carro(final String marca,final String model, final int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public void setMarca(final String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }

    public void setModelo(final String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }

    public void setAno(final int ano){
        this.ano = ano;
    }
    public Integer getAno(){
        return ano;
    }

    public void setVariante(final String variante)
    {
        this.variante = variante;
    }

    @Override
    public String toString(){
        StringBuilder texto = new StringBuilder();
        texto.append("Marca " + marca);
        texto.append("\n");
        texto.append("Modelo " + modelo);
        texto.append("\n");
        texto.append("Ano " + ano);
        texto.append("\n");
        texto.append("Variante " + variante);
        texto.append("\n");
        return texto.toString();
    }
}
