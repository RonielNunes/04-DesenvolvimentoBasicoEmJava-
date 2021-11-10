package aulas.OrientacaoObjetos.part03.EncapsulamentoHerancaEPolimorfismo.Exercicio;

public class Programa {
    public static void main(String []args){
        Gerente gerente = new Gerente("G","000000-0",23,18000,0.001);
        Supervisor supervisor = new Supervisor("S","000000-0",23,18000,0.0005);
        Atendente atendente = new Atendente("A","000000-0",23,18000,0.0001);

        System.out.println(gerente.toString() + " " + gerente.imposto());
        System.out.println(supervisor.toString() + " " + supervisor.imposto());
        System.out.println(atendente.toString() + " " + atendente.imposto());



    }
}
