package strings;

public class StringBuilder {
    public static void main(Strings[] args) {

        var nome = "André";
        final var builder = new java.lang.StringBuilder(nome);
        System.out.println(builder.append("Luis"));
        //Vai contatendando nossa estrings à armazenada anteriormente.
        final var reverse = builder.reverse();

        System.out.println(reverse);
        //Faz a string de forma reversa
        final var insert = reverse.insert(0, "#").insert(reverse.length(), "#");
        System.out.println(insert);
        //Insere caracteres em algumas posições.
    }
}
