package one.digitalinovation.tipos.tipagem;

public class TipagemForte {
    public static void main(String[] args) {
        String texto = "meu texto";
        //Tipagem forte, uma vez instânciado o
        //tipo da variável ela só podera receber
        // seu tipo instânciado. Não aceita valores
        // de outros tipos sem que sejam convertidas

        //texto = 100; ERROR

        Integer numero = Integer.valueOf("10024");
        System.out.println(numero);
        numero = 1231; //Ok
        System.out.println(numero);
    }
}
