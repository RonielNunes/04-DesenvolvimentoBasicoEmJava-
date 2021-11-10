package one.digitalinovation.classes.cliente;

public class ProgramaDoCliente {
    public static void main(String[] args) {
        final var cliente = new Cliente(18);

        cliente.getIdade();
        cliente.getPeso();
        //Sem acesso pois é protected
        //System.out.println(cliente.relatorio());
    }
}
