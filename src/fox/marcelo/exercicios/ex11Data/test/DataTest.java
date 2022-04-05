package fox.marcelo.exercicios.ex11Data.test;

import fox.marcelo.exercicios.ex11Data.domain.Data;

public class DataTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Data data = new Data("04", "04", "2022");
        Data data1 = data.clone();

        System.out.println(data.compara(data));
        System.out.println(data.getMesExtenso());
        System.out.println(data.isBissexto());
        System.out.println(data);
        System.out.println(data1);
    }
}
