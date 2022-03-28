package fox.marcelo.exercicios.ex08AlunoMatriculado.domain;

public class AlunoMatriculado {

    private static long GERADOR_MATRICULA;

    private long matricula;
    private String nome;
    private double notaUm, notaDois, notaTrabalho;

    public AlunoMatriculado(String nome, double notaUm, double notaDois, double notaTrabalho) {
        GERADOR_MATRICULA++;
        this.nome = nome;
        this.notaUm = notaUm;
        this.notaDois = notaDois;
        this.notaTrabalho = notaTrabalho;
        this.matricula = GERADOR_MATRICULA;
    }

    public double media() {
        double somaNotas = (this.notaUm * 2.5) + (this.notaDois * 2.5) + (this.notaTrabalho * 2);
        double somaDosPesos = 2.5 + 2.5 + 2;
        return somaNotas / somaDosPesos;
    }

    public void provaFinal(double mediaDoAluno) {
        if (mediaDoAluno < 7) {
            double quantoPrecisaFinal = 6 - mediaDoAluno;
            System.out.println("O aluno " + this.nome + " precisa de " + String.format("Média: " + "%.1f", quantoPrecisaFinal) + " pontos para a final.");
            return;
        }
        System.out.println("O " + this.nome + " está aprovado!");
    }

    @Override
    public String toString() {
        return "AlunoMatriculado{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", notaUm=" + notaUm +
                ", notaDois=" + notaDois +
                ", notaTrabalho=" + notaTrabalho +
                '}';
    }
}
