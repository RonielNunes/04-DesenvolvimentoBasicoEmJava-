package aulas.OrientacaoObjetos.part03.EncapsulamentoHerancaEPolimorfismo.Encapsulamento;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa{
    //ENCAPSULAMENTO DO ATRIBUTO
    private String nome;
    private LocalDate nascimento;

    public Pessoa(final String nome, final int ano, final int mes,final int dia)
    {
        this.nome = nome;
        this.nascimento = LocalDate.of(ano,mes,dia);
    }
    public int idade(){
        return Period.between(nascimento,LocalDate.now()).getYears();
    }
    public String getNome(){
        return nome;
    }

    public LocalDate getDataNascimento(){
        return nascimento;
    }
    public void setNome(final String nome){
        this.nome = nome;
    }
}

