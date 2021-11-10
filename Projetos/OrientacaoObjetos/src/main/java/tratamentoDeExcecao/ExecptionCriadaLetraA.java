package tratamentoDeExcecao;

public class ExecptionCriadaLetraA extends Exception{
    @Override
    public String getMessage(){
        return "Seu conjunto de caracteres nao contem a lentra A.";
    }
}
