package fox.marcelo.exercicios.ex13Prova.domain;

import java.util.ArrayList;
import java.util.List;

public class Prova {

    private Gabarito gabarito = new Gabarito();
    private List<Character> questoesRespondida = new ArrayList<>();

    public Prova(Gabarito gabarito) {
        this.gabarito = gabarito;
    }

    public void respostaAluno(char resposta) {
        this.questoesRespondida.add(resposta);
    }

    public int acertos() {
        int contaAcertos = 0;
        for (int i = 0; i < this.questoesRespondida.size(); i++)
            if (this.gabarito.respostaQuestoes(i) == this.questoesRespondida.get(i)) {
                contaAcertos++;
            }
        return contaAcertos;
    }

    public double nota() {
        int contaAcertosMeioPonto = 0;
        int contaAcertosUmPonto = 0;
        for (int i = 0; i < this.questoesRespondida.size(); i++) {
            if (i < 10) {
                if (this.gabarito.respostaQuestoes(i) == this.questoesRespondida.get(i)) {
                    contaAcertosMeioPonto++;
                }
            } else {
                if (this.gabarito.respostaQuestoes(i) == this.questoesRespondida.get(i)) {
                    contaAcertosUmPonto++;
                }
            }
        }
        return contaAcertosMeioPonto * 0.5 + contaAcertosUmPonto;
    }

    public void maior(Prova prova) {
        if (this.nota() == prova.nota()) {
            System.out.println("Empate!");
            System.out.println(this.nota());
        } else if (this.nota() > prova.nota()) {
            System.out.println(this.nota() + " Maior Nota");
        } else {
            System.out.println(prova.nota() + " Maior Nota");
        }
    }

    @Override
    public String toString() {
        return "Prova{" +
                "questaoRespondida=" + questoesRespondida +
                '}';
    }
}
