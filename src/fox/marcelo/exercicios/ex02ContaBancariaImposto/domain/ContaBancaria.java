package fox.marcelo.exercicios.ex02ContaBancariaImposto.domain;

public class ContaBancaria {
    protected static int GERADOR_NUMEROS;

    protected int numero = 0;
    private double saldo;

    public ContaBancaria(double saldo) {
        GERADOR_NUMEROS++;
        this.saldo = saldo;
        this.numero = GERADOR_NUMEROS;
    }

    public void sacar(double valorDoSaque) {
        if (this.saldo <= 0) {
            System.out.println("Sem saldo para saque! O seu saldo é de: " + this.saldo);
            return;
        }
        this.saldo -= valorDoSaque;
        System.out.println("Saque Realizado! O seu saldo é de: " + this.saldo);
    }

    public void depositar(double valorDoDeposito) {
        if (valorDoDeposito <= 0) {
            System.out.println("Não é possível depositar este valor!");
            return;
        }
        this.saldo += valorDoDeposito;
        System.out.println("Deposito Realizado! O seu saldo é de: " + this.saldo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
