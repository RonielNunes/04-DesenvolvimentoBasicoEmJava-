package SOLID.ISP.problem;

public class Pinguim implements Ave{
    @Override
    public void bicar() {
        //Consegue bicar
    }

    @Override
    public void chocarOvos() {
        //consegue chocar
    }

    @Override
    public void voar() {
        //não consegue, devemos segregar a interface. pois não antede a todos
    }
}
