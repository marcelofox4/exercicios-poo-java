package fox.marcelo.exercicios.ex10Calculadora.domain;

public class CalculadoraCientifica extends Calculadora {

    public double raizQuadrada(double numero) {
        return Math.sqrt(numero);
    }

    public double potencia(double numeroBase, double numeroPotencia) {
        return Math.pow(numeroBase, numeroPotencia);
    }
}
