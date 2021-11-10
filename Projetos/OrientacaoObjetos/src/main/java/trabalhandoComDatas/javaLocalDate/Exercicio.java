package trabalhandoComDatas.javaLocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exercicio {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Horas: " + localTime);
        System.out.println("Data: " + localDate);
        System.out.println("Data e hora: " + localDateTime);
        System.out.println("Formatado: " + localDateTime.format(formatter)); //Retorna uma string

        LocalDateTime dataAgora = LocalDateTime.of(2010,5,10,10,0,0);//Inicializando com a data requerida
        System.out.println(dataAgora.format(formatter));

        LocalDateTime dataFuturo = dataAgora.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(dataFuturo.format(formatter));
    }
}
