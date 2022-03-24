package fox.marcelo.exercicios.ex05Pessoa.test;

import fox.marcelo.exercicios.ex05Pessoa.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {

        Pessoa pessoa01 = new Pessoa("Marcelo", 1.65, "04/06/1991");
        int idadePessoa01 = pessoa01.calcularIdade(pessoa01.getDataDeNascimento());
        System.out.println(pessoa01);
        System.out.println("Idade de " + pessoa01.getNome() + " é: " + idadePessoa01);
    }
}
