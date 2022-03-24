package fox.marcelo.exercicios.ex07ControleRemoto.test;

import fox.marcelo.exercicios.ex07ControleRemoto.domain.ControleRemoto;

public class ControleRemotoTeste {
    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto();

        System.out.println("----------------------------------");

        controleRemoto.volume("+");
        controleRemoto.volume("+");
        controleRemoto.volume("+");
        controleRemoto.volume("-");
        controleRemoto.consultarVolumeCanal();

        System.out.println("----------------------------------");

        controleRemoto.canal("+");
        controleRemoto.canal("-");
        controleRemoto.canal("-");
        controleRemoto.canal("-");
        controleRemoto.consultarVolumeCanal();

        System.out.println("----------------------------------");

        controleRemoto.escolherCanal(20);
        controleRemoto.consultarVolumeCanal();
    }
}
