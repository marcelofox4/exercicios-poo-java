package fox.marcelo.exercicios.ex10Calculadora.test;

import fox.marcelo.exercicios.ex10Calculadora.domain.CalculadoraCientifica;

public class CalculadoraTest {
    public static void main(String[] args) {
        CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();

        System.out.println("Soma: " + calculadoraCientifica.soma(4, 2));
        System.out.println("Subtração: " + calculadoraCientifica.subtração(14, 15));
        System.out.println("Multiplicação: " + calculadoraCientifica.multiplicação(4, 2));
        System.out.println("Divisão: " + calculadoraCientifica.divisão(4, 2));
        System.out.println("Divisão: " + calculadoraCientifica.divisão(4, 0));
        System.out.println("Raiz Quadrada: " + calculadoraCientifica.raizQuadrada(16));
        System.out.println("Potência: " + calculadoraCientifica.potencia(2,2));
    }
}
