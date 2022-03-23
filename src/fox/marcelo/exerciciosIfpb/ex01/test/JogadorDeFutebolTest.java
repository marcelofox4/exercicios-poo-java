package fox.marcelo.exerciciosIfpb.ex01.test;

import fox.marcelo.exerciciosIfpb.ex01.domain.JogadorDeFutebol;

public class JogadorDeFutebolTest {
    public static void main(String[] args) {

        JogadorDeFutebol jogador01 = new JogadorDeFutebol(
                "Marcelo",
                "Atacante",
                "04/06/1991");
        int idadeDoJogador01 = jogador01.calcularIdade(jogador01.getDataDeNascimento());
        jogador01.calcularTempoAposentadoria(idadeDoJogador01);
        System.out.println(jogador01);

        System.out.println("-----------------------------------");

        JogadorDeFutebol jogador02 = new JogadorDeFutebol(
                "Marcelo",
                "Defesa",
                "06/12/1986",
                "Brasileiro",
                1.90,
                80.8);
        int idadeDoJogador02 = jogador02.calcularIdade(jogador02.getDataDeNascimento());
        jogador02.calcularTempoAposentadoria(idadeDoJogador02);
        System.out.println(jogador02);
    }
}
