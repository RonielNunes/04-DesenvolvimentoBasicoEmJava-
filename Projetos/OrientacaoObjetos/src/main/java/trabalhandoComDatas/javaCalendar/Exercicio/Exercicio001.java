package trabalhandoComDatas.javaCalendar.Exercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exercicio001 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Calendar agora = Calendar.getInstance(); //Faz uma instances
        System.out.println("Data da fatura gerada: " + sdf.format(agora.getTime()));

        Calendar vencimento = Calendar.getInstance();
        vencimento.add(Calendar.DATE,10);//Adiciona mais 10 dias

        while (vencimento.get(Calendar.DAY_OF_WEEK) == 1 || vencimento.get(Calendar.DAY_OF_WEEK) == 7){
            vencimento.add(Calendar.DATE,1);
        }
        System.out.println("Fatura gerada: " + sdf.format(vencimento.getTime()));
    }
}
