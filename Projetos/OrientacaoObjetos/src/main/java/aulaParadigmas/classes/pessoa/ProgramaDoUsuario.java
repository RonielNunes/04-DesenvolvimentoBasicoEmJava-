package one.digitalinovation.classes.pessoa;

import one.digitalinovation.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {
    public static void main(String[] args) {
        final var batmam = new SuperUsuario("batman", "12323");
        batmam.getLogin();

        //batman.getSenha(); //Erro
        //String nomeDoCliente = batman.nome // Erro
    }
}
