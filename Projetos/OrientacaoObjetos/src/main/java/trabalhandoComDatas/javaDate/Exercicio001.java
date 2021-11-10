package trabalhandoComDatas.javaDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio001 {
    public static void main(String[] args) throws ParseException {
        //Exercicio001 e = new Exercicio001();

        //Long currentTimeMillisInstanteAtual = System.currentTimeMillis();
        //Long anos = 725328000000L; //23 anos 725328000000
        //Long meses = 2628000000L;//1 mês
        //Long dias = 2073600000L; //24 dias
        //Date data = e.checkLong(currentTimeMillisInstanteAtual - anos - meses - dias);

        //System.out.println(data);

        Date dataNascimento = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("1998-01-25 18:18:00");

        Date dataComparada = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2010-05-15 00:00:00");

        //convertendo para milisegundos
        Long dataN = dataNascimento.getTime();
        Long dataC = dataComparada.getTime();

        Date novasDatasN = new Date(dataN);
        Date novasDatasC = new Date(dataC);

        System.out.println(novasDatasN.after(novasDatasC));
        System.out.println(novasDatasN.before(novasDatasC));


    }

    /**
     * @param epoch, valor de tempo em milisegundos
     * @return dateNacimento, data do nascimento
     **/
    public Date checkLong(final long epoch){
        Date dateNacimento = new Date(epoch); //Faz a intanciação da data de nascimento
        //System.out.println(dateNacimento);
        return dateNacimento;
    }

}
