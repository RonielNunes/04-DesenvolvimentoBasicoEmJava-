package one.digitalinovation.finals;

public class Gamer {
    public String keyboard(){return "keyboard gamer";}
    //quem herda mouse não consegue sobrescrever
    public final String mouse(){return  "Mouse Gamer";}
}
