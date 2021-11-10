package one.digitalinovation.classes.usuario;

public class ProgramaDoSuperUsuario {
    public static void main(String[] args) {
        //intânciando uma nova classe, uma instânciação é a criação de uma variável
        // para armazenar o endereço de um objeto. Ou seja, a palavra reservada new faz
        // a alocação de mémoria para uma estrutura formulada pela classe. Assim a variável
        // recebe o endereço desse oçbjeto criado.

        final var superUsuario = new SuperUsuario("root", "12345");

        superUsuario.getLogin();
        superUsuario.getSenha();
        String root = superUsuario.nome;
    }
}
