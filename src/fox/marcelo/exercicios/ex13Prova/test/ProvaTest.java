package fox.marcelo.exercicios.ex13Prova.test;

import fox.marcelo.exercicios.ex13Prova.domain.Gabarito;
import fox.marcelo.exercicios.ex13Prova.domain.Prova;

public class ProvaTest {
    public static void main(String[] args) {

        Gabarito gabarito = new Gabarito();
        System.out.println(gabarito.respostaQuestoes(1));

        Prova prova = new Prova(gabarito);
        Prova provadois = new Prova(gabarito);
        prova.respostaAluno('a');
        prova.respostaAluno('b');
        prova.respostaAluno('c');
        prova.respostaAluno('d');
        prova.respostaAluno('e');
        prova.respostaAluno('a');
        prova.respostaAluno('b');
        prova.respostaAluno('c');
        prova.respostaAluno('d');
        prova.respostaAluno('e');
        prova.respostaAluno('a');
        prova.respostaAluno('b');
        prova.respostaAluno('c');
        prova.respostaAluno('d');
        prova.respostaAluno('a');

        provadois.respostaAluno('a');
        provadois.respostaAluno('b');
        provadois.respostaAluno('c');
        provadois.respostaAluno('d');
        provadois.respostaAluno('e');
        provadois.respostaAluno('a');
        provadois.respostaAluno('b');
        provadois.respostaAluno('c');
        provadois.respostaAluno('d');
        provadois.respostaAluno('e');
        provadois.respostaAluno('a');
        provadois.respostaAluno('b');
        provadois.respostaAluno('c');
        provadois.respostaAluno('d');
        provadois.respostaAluno('e');

        System.out.println("Prova Um: " + prova);
        System.out.println("Acertos da prova um: " + prova.acertos());
        System.out.println("Nota da Prova um: " + prova.nota());

        System.out.println("-------------------------------------------------------");

        System.out.println("Prova Dois: " + provadois);
        System.out.println("Acertos da prova dois: " + provadois.acertos());
        System.out.println("Nota da Prova dois: " + provadois.nota());

        System.out.println("-------------------------------------------------------");

        prova.maior(provadois);
    }
}
