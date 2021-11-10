package one.digitalinovation.finals;

public class CasualGamer extends Gamer{
    @Override
    public String keyboard(){ return "simples keyboard...";}

    //@Override
    //public String mouse(){
    //    return "não da para sobrescrever o método, pois é final";
    //}
    public String play(final String game){
        //game = "woow" não consegue sobrescresver o valor da variável modificada como final
        return "Jogando" + game;
    }
}
