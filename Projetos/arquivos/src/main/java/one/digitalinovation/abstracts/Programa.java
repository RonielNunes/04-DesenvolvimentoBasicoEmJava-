package one.digitalinovation.abstracts;

public class Programa {
    public static void main(String[] args) {

        //final FormaGeometrica = new FormaGeometrica();
        final Quadrado quadrado = new Quadrado("quadrado", 12.0);

        System.out.println(quadrado.desenha(12,34));
        System.out.println(quadrado.nome());
        System.out.println(quadrado.area());
    }
}
