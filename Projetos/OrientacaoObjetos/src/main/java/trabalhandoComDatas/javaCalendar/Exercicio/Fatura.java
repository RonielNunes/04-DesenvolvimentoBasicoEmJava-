package trabalhandoComDatas.javaCalendar.Exercicio;

import java.util.Calendar;
import java.util.Date;

public class Fatura {
    private Double valor;
    private Calendar dataFatura;
    private Calendar dataVencimento;
    private Integer peridoDePagamento;

    Fatura(final double valor, final int peridoDePagamento){
        this.valor = valor;
        this.peridoDePagamento = peridoDePagamento;

        this.dataFatura = Calendar.getInstance();
        setDataVencimento();

    }
    public void setValor(final double valor){
        this.valor = valor;
    }
    public Double getValor(){
        return valor;
    }

    public Integer getPeridoDePagamento(){return peridoDePagamento;}

    public Date getDataFatura(){
        return (Date)this.dataFatura.getTime();
    }

    private void setDataVencimento(){
        dataVencimento = Calendar.getInstance();
        dataVencimento.add(Calendar.DATE,getPeridoDePagamento());
        if(dataVencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){ //Se igual a sábado + 2 dias
            dataVencimento.add(Calendar.DATE,2);
        }else if(dataVencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){ //Se igual a domingo mais um dia
            dataVencimento.add(Calendar.DATE,1);
        }
    }
    public Date getDataVencimento(){return  dataVencimento.getTime();}

}
