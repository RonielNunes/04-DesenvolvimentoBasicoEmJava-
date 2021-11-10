package trabalhandoComDatas.javaCalendar.Exercicio;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Exercicio002 {
    public static void main(String[] args) {
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Fatura fatura = new Fatura(1000,10);

        System.out.println("Fatura gerada: " + sdf.format(fatura.getDataFatura()));
        System.out.println("Fatura Vencimento: " + sdf.format(fatura.getDataVencimento()));
    }
}
