package fox.marcelo.exercicios.ex08AlunoMatriculado.test;

import fox.marcelo.exercicios.ex08AlunoMatriculado.domain.AlunoMatriculado;

public class AlunoMatriculadoTest {
    public static void main(String[] args) {

        AlunoMatriculado alunoMatriculadoUm = new AlunoMatriculado("Marcelo Sodré", 7, 8, 6);
        AlunoMatriculado alunoMatriculadoDois = new AlunoMatriculado("Priscilla Aquila", 4, 5, 6);

        System.out.println(alunoMatriculadoUm);
        System.out.println(String.format("Média: " + "%.1f", alunoMatriculadoUm.media()));
        alunoMatriculadoUm.provaFinal(alunoMatriculadoUm.media());

        System.out.println("-----------------------------------");

        System.out.println(alunoMatriculadoDois);
        System.out.println(String.format("Média: " + "%.1f", alunoMatriculadoDois.media()));
        alunoMatriculadoDois.provaFinal(alunoMatriculadoDois.media());
    }
}
