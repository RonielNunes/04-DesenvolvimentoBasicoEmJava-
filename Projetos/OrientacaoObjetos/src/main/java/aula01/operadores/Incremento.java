package operadores;

public class Incremento {
    public static void main(String[] args) {

        var numero = 1;

        System.out.println(++numero);

        //var variavel = 10;
        int variavel = 10;
        System.out.printf("Decremento da variavel: %d \n",variavel--);
        System.out.println(String.format("Novo valor da variavel: " +  Integer.toString(variavel)));
    }
}
