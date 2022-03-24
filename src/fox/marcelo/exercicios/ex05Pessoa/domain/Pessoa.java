package fox.marcelo.exercicios.ex05Pessoa.domain;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pessoa {
    private String nome;
    private double altura;
    private String dataDeNascimento;

    public Pessoa(String nome, double altura, String dataDeNascimento) {
        this.nome = nome;
        this.altura = altura;
        this.dataDeNascimento = dataDeNascimento;
    }

    public int calcularIdade(String dataDeNascimento) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date dataDeNasc = null;
        try {
            dataDeNasc = dateFormat.parse(dataDeNascimento);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendarDataDeNasc = new GregorianCalendar();
        calendarDataDeNasc.setTime(dataDeNasc);

        Calendar dataAtual = Calendar.getInstance();

        int idade = dataAtual.get(Calendar.YEAR) - calendarDataDeNasc.get(Calendar.YEAR);
        calendarDataDeNasc.add(Calendar.YEAR, idade);
        if (dataAtual.before(calendarDataDeNasc)){
            idade--;
        }
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", altura=" + altura +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                '}';
    }
}
