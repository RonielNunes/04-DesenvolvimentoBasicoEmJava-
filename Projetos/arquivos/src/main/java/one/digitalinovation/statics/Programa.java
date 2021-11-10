package one.digitalinovation.statics;

public class Programa {
    public static void main(String[] args) {
        final Cachorro pitbull = new Cachorro();
        pitbull.zoologia = "Bipede";

        final Cachorro viralata = new Cachorro();
        viralata.zoologia = "tripede";

        System.out.println("Zoolodia : " + pitbull.zoologia);
        System.out.println("Zoolodia : " + viralata.zoologia);
        System.out.println("Zoolodia Static: " + viralata.zoologia2);
        System.out.println("Zoolodia Static: " + pitbull.zoologia2);

        viralata.zoologia2 = "troca em tudo";

        System.out.println("Zoolodia Static: " + viralata.zoologia2);
        System.out.println("Zoolodia Static: " + pitbull.zoologia2);

        Cachorro.late(); //Método estático não precisa ser instânciado
    }
}
