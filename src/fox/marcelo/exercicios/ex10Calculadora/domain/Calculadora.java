package fox.marcelo.exercicios.ex10Calculadora.domain;

public abstract class Calculadora {

    public double soma(double numeroUm, double numeroDois) {
        return numeroUm + numeroDois;
    }

    public double subtração(double numeroUm, double numeroDois) {
        return numeroUm - numeroDois;
    }

    public double multiplicação(double numeroUm, double numeroDois) {
        return numeroUm * numeroDois;
    }

    public double divisão(double numeroUm, double numeroDois) {
        if (numeroDois < 0) {
            return 0;
        }
        return numeroUm / numeroDois;
    }
}
