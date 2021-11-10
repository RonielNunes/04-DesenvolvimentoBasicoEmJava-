package tratamentoDeExcecao;


import java.time.LocalTime;
import java.util.Random;

public class ExecaoTryCatch {
    public static void main(String[] args) throws ExecptionCriadaLetraA {
        String referencia = null; //Erro de referência
        String saida = null;

        int valor = 0; //Erro aritmetico
        int valorSaida;

        String nome = "Bruno"; //Erro sem caracter a
        //Exceção de referência
        try{
            saida = referencia.toUpperCase();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println("*Erro de referencia encontrado. Tratamento em execucao*");
            referencia = "Erro corrigido";
        }finally {
            saida = referencia.toUpperCase();
        }
        System.out.println(saida);
        //Exceção aritmética
        try{
            valorSaida = 1/valor;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Erro aritmético ");
            valor = 1;
        }finally {
            valorSaida = 1/valor;
            System.out.println("valor: " + valorSaida);
        }

        //Exceção criada
        try{
            if(!nome.contains("A")){
                throw new ExecptionCriadaLetraA();//lança a exeção
            }
        }catch (ExecptionCriadaLetraA e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Nome: " + nome);
        }

        try{
            mensagem();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.toString());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.toString());
        }catch (ExecptionCriadaLetraA e){
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.toString());
        }finally {
            System.out.println("Exceções tratadas.");
        }
    }


    public static void mensagem()throws NullPointerException,ArithmeticException,ExecptionCriadaLetraA{
        Random random = new Random();
        int seed = LocalTime.now().getSecond();
        int numero =random.nextInt(seed) % 3;

        if(numero == 0){
            throw new NullPointerException(); //Lança
        }else if(numero == 1){
            throw new ArithmeticException();
        }else{
            throw new ExecptionCriadaLetraA();
        }
    }
}
