package fox.marcelo.exerciciosIfpb.ex02.test;

import fox.marcelo.exerciciosIfpb.ex02.domain.ContaBancaria;
import fox.marcelo.exerciciosIfpb.ex02.domain.ContaImposto;

public class ContaBancariaTest {
    public static void main(String[] args) {

        ContaBancaria conta01 = new ContaBancaria(2000);
        ContaBancaria conta02 = new ContaBancaria(3000);

        System.out.println(conta01);
        System.out.println(conta02);

        System.out.println("");

        ContaImposto conta03 = new ContaImposto(2000);
        System.out.println(conta03);

        conta03.depositar(200);
        conta03.sacar(2000);
        conta03.calcularImposto();
    }
}
