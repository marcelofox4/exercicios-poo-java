package fox.marcelo.exercicios.ex03IngressoVip.test;

import fox.marcelo.exercicios.ex03IngressoVip.domain.Ingresso;
import fox.marcelo.exercicios.ex03IngressoVip.domain.IngressoVip;

public class IngressoTest {
    public static void main(String[] args) {

        Ingresso ingresso01 = new Ingresso(200);
        IngressoVip ingresso02 = new IngressoVip(ingresso01.getValor(), 100);

        ingresso02.retornaValorComAdicionalVip();
        System.out.println("Ingresso Vip: " + ingresso02.getValor());
        System.out.println("Ingresso: " + ingresso01.getValor());
    }
}
