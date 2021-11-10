package one.digitalinovation.classes.pessoa;

import one.digitalinovation.classes.cliente.Cliente;

public class ProgramaDoCliente {
    public static void main(String[] args) {
        final var cliente = new Cliente(18);
        cliente.getIdade();
        cliente.getPeso();
        //Da para acessar pois estão no mesmo pacote
        System.out.println(cliente.relatorio());
    }
}
