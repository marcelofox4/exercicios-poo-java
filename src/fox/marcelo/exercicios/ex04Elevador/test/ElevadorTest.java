package fox.marcelo.exercicios.ex04Elevador.test;

import fox.marcelo.exercicios.ex04Elevador.domain.Elevador;

public class ElevadorTest {
    public static void main(String[] args) {

        Elevador elevador = new Elevador();

        elevador.inicializar(10, 20);

        elevador.entrar(11);
        System.out.println(elevador);

        elevador.subir(10);
        System.out.println(elevador);

        elevador.sair(10);
        System.out.println(elevador);

        elevador.entrar(5);
        elevador.descer(5);
        elevador.entrar(5);
        elevador.descer(0);
    }
}
