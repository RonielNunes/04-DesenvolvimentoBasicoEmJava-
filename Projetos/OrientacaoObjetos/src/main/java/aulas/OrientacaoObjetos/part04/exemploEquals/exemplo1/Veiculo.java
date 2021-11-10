package aulas.OrientacaoObjetos.part04.exemploEquals.exemplo1;

public abstract  class Veiculo {
    private String modelo;
    private String marca;
    private double valorVenal;

    Veiculo(final String modelo, final String marca, final double valorVenal){
        this.modelo = modelo;
        this.marca = marca;
        this.valorVenal = valorVenal;
    }

    public String getModelo(){return modelo;}
    public void setModelo(final String modelo){this.modelo = modelo;}
    public String getMarca(){return marca;}
    public void setMarca(final String marca){this.marca = marca;}
    public void acelera(){System.out.println("Aceletando...");}
    public double getValorVenal(){
        return valorVenal;
    }
    public double calculaImposto(){return this.valorVenal * 0.01;}
}


