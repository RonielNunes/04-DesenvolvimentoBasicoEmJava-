package SOLID.LSP.problem;

public class Quadrado extends Retangulo{
    @Override
    public void setAltura(final double altura){
        super.setAltura(altura);
        super.setLargura(altura);
    }
    @Override
    public void setLargura(final double lagura){
        super.setLargura(lagura);
        super.setAltura(lagura);
    }
}
