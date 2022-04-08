package fox.marcelo.exercicios.ex14Vetores.test;

import fox.marcelo.exercicios.ex14Vetores.domain.Vetor;

public class VetorTest {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(2);

        vetor.insert("00");
        vetor.insert("01");
        vetor.insert("02");
        vetor.insert("03");
        vetor.insert("04");
        vetor.insert("05");

        System.out.println(vetor);
        System.out.println(vetor.get(5));
        System.out.println(vetor.get(6));
        System.out.println(vetor.size());
    }
}
