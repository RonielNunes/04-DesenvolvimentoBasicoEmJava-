package aulaParadigmas.abstracts;

public class Quadrado extends FormaGeometrica{
    private String nome;
    private Double area;
    //Quando uma classe herda uma classe abstract, ela devera implementar seus métodos abstracts
    public Quadrado(final String nome,final Double area){
        this.nome = nome;
        this.area = area;
    }

    @Override
    public String nome() {
        return nome;
    }

    @Override
    public Double area() {
        return area;
    }

    @Override
    public String toString(){
        final StringBuilder builder =  new StringBuilder();
        builder.append("Quadrado [");
        builder.append(nome);
        builder.append("]");
        builder.append("area [");
        builder.append(area);
        builder.append("]");
        return builder.toString();
    }
}
