package one.digitalinovation.finals;

public class Programa {
    public static void main(String[] args) {
        final HardcoreGamer hardcoreGamer = new HardcoreGamer();
        final Gamer gamer=  new Gamer();
        final CasualGamer casualGamer = new CasualGamer();

        final var game = "CS GO";

        //game = Wow;
        System.out.println(casualGamer.play(game));
    }
}
