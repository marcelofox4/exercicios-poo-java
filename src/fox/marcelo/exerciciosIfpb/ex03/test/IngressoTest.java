package fox.marcelo.exerciciosIfpb.ex03.test;

import fox.marcelo.exerciciosIfpb.ex03.domain.Ingresso;
import fox.marcelo.exerciciosIfpb.ex03.domain.IngressoVip;

public class IngressoTest {
    public static void main(String[] args) {

        Ingresso ingresso01 = new Ingresso(200);
        IngressoVip ingresso02 = new IngressoVip(ingresso01.getValor(), 100);

        ingresso02.retornaValorComAdicionalVip();
        System.out.println("Ingresso Vip: " + ingresso02.getValor());
        System.out.println("Ingresso: " + ingresso01.getValor());
    }
}
