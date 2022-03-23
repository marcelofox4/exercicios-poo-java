package fox.marcelo.exerciciosIfpb.ex04.domain;

public class Elevador {

    private int andarAtual = 0;
    private int totalDeAndares;
    private int capacidade;
    private int quantidadeDePessoas;

    public void inicializar(int capacidade, int totalDeAndares) {
        this.capacidade = capacidade;
        this.totalDeAndares = totalDeAndares;
    }

    public void entrar(int quantidadeDePessoas) {
        this.quantidadeDePessoas += quantidadeDePessoas;
        if (this.quantidadeDePessoas > this.capacidade) {
            this.quantidadeDePessoas = this.capacidade;
        }
    }

    public void sair(int quantidadeDePessoas) {
        if (this.quantidadeDePessoas == 0) {
            return;
        }
        this.quantidadeDePessoas -= quantidadeDePessoas;
    }

    public void subir(int andar) {
        if (andar > this.totalDeAndares) {
            System.out.println("Não é possível subir!");
            return;
        }
        this.andarAtual = andar;
        System.out.println("Subiu...");
    }

    public void descer(int andar) {
        if (andar < 0) {
            System.out.println("Não é possível descer!");
            return;
        }
        this.andarAtual = andar;
        System.out.println("Desceu...");
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQuantidadeDePessoas() {
        return quantidadeDePessoas;
    }

    public void setQuantidadeDePessoas(int quantidadeDePessoas) {
        this.quantidadeDePessoas = quantidadeDePessoas;
    }

    @Override
    public String toString() {
        return "Elevador{" +
                "andarAtual=" + andarAtual +
                ", totalDeAndares=" + totalDeAndares +
                ", capacidade=" + capacidade +
                ", quantidadeDePessoas=" + quantidadeDePessoas +
                '}';
    }
}
