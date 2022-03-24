package fox.marcelo.exercicios.ex06Agenda.domain;

public class Agenda {

    private Pessoa[] pessoas;

    public Agenda() {
        this.pessoas = new Pessoa[10];
    }

    public void armazenaPessoa(String nome, int idade, double altura) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] == null) {
                pessoas[i] = new Pessoa(nome, idade, altura);
                return;
            }
        }
    }

    public void removePessoa(String nome) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getNome().equalsIgnoreCase(nome)){
                pessoas[i] = null;
                return;
            }
        }
    }

    public int buscarPessoa(String nome) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return 0;
    }

    public void imprimeAgenda() {
        for (Pessoa pessoa : pessoas) {
            if (pessoa == null) {
                continue;
            }
            System.out.println("--------------------------");
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Altura: " + pessoa.getAltura());
            System.out.println("--------------------------");
        }
    }

    public void imprimePessoa(int index) {
        for (int i = 0; i < pessoas.length; i++) {
            if (i == index){
                System.out.println(pessoas[i].toString());
            }
        }
    }
}
