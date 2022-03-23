package fox.marcelo.exercicios.ex02ContaBancariaImposto.domain;

public class ContaImposto extends ContaBancaria {

    private final double percentualImposto = 0.1;

    public ContaImposto(double saldo) {
        super(saldo);
    }

    public void calcularImposto(){
        double imposto = this.getSaldo() * this.percentualImposto;
        setSaldo(this.getSaldo() - imposto);
        System.out.println("Imposto: " + imposto);
        System.out.println("Saldo: " + getSaldo());
    }

    public double getPercentualImposto() {
        return percentualImposto;
    }
}
