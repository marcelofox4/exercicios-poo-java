package fox.marcelo.exerciciosIfpb.ex01.domain;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class JogadorDeFutebol {

    private String nome;
    private String posicao;
    private String dataDeNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;

    public JogadorDeFutebol(String nome, String posicao, String dataDeNascimento) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataDeNascimento = dataDeNascimento;
    }

    public JogadorDeFutebol(String nome, String posicao, String dataDeNascimento, String nacionalidade, double altura, double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataDeNascimento = dataDeNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public int calcularIdade(String dataDeNascimento) {

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date dataDeNascimentoFormatoDate = null;
        try {
            dataDeNascimentoFormatoDate = format.parse(dataDeNascimento);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar dataDeNasc = new GregorianCalendar();
        dataDeNasc.setTime(dataDeNascimentoFormatoDate);

        Calendar dataAtual = Calendar.getInstance();

        int idade = dataAtual.get(Calendar.YEAR) - dataDeNasc.get(Calendar.YEAR);

        dataDeNasc.add(Calendar.YEAR, idade);
        if (dataAtual.before(dataDeNasc)) {
            idade--;
        }
        return idade;
    }

    public void calcularTempoAposentadoria(int idade) {
        if (this.posicao.equalsIgnoreCase("DEFESA")) {
            if (idade >= 40) {
                System.out.println("Aposentado");
            } else {
                int tempoDeAposentadoria = 40 - idade;
                System.out.println("Falta " + tempoDeAposentadoria + " anos para se aposentar.");
            }
        } else if (this.posicao.equalsIgnoreCase("MEIO CAMPO")) {
            if (idade >= 38) {
                System.out.println("Aposentado");
            } else {
                int tempoDeAposentadoria = 38 - idade;
                System.out.println("Falta " + tempoDeAposentadoria + " anos para se aposentar.");
            }
        } else if (this.posicao.equalsIgnoreCase("ATACANTE")) {
            if (idade >= 35) {
                System.out.println("Aposentado");
            } else {
                int tempoDeAposentadoria = 35 - idade;
                System.out.println("Falta " + tempoDeAposentadoria + " anos para se aposentar.");
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "JogadorDeFutebol{" +
                "nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
