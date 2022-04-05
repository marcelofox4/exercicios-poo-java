package fox.marcelo.exercicios.ex12Voo.test;

import fox.marcelo.exercicios.ex11Data.domain.Data;
import fox.marcelo.exercicios.ex12Voo.domain.Voo;

public class VooTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Voo vooUm = new Voo(1, new Data("10","04","2022"));

        System.out.println(vooUm);
        vooUm.ocupa(10);
        vooUm.ocupa(11);
        vooUm.ocupa(2);
        vooUm.ocupa(3);
        vooUm.ocupa(0);

        System.out.println(vooUm);

        vooUm.verifica(10);
        vooUm.verifica(1);
        System.out.println(vooUm.proximoLivre());
        System.out.println(vooUm.vagas());
        System.out.println(vooUm.getVoo());
        System.out.println(vooUm.getData());

        Voo vooDois = vooUm.clone();
        System.out.println(vooDois);

    }
}
