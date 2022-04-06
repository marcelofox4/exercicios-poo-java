package fox.marcelo.exercicios.ex13Prova.domain;

import java.util.ArrayList;
import java.util.List;

public class Gabarito {

    List<Character> respostaQuestoes = new ArrayList<>();

    public char respostaQuestoes(int numeroQuestao) {
        respostaQuestoes.add('a');
        respostaQuestoes.add('b');
        respostaQuestoes.add('c');
        respostaQuestoes.add('d');
        respostaQuestoes.add('e');
        respostaQuestoes.add('a');
        respostaQuestoes.add('b');
        respostaQuestoes.add('c');
        respostaQuestoes.add('d');
        respostaQuestoes.add('e');
        respostaQuestoes.add('a');
        respostaQuestoes.add('b');
        respostaQuestoes.add('c');
        respostaQuestoes.add('d');
        respostaQuestoes.add('e');

        return respostaQuestoes.get(numeroQuestao);
    }
}
