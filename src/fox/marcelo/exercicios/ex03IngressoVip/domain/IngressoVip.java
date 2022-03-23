package fox.marcelo.exercicios.ex03IngressoVip.domain;

public class IngressoVip extends Ingresso{
    private double valorAdicional;

    public IngressoVip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double retornaValorComAdicionalVip(){
        setValor(getValor() + this.valorAdicional);
        return getValor();
    }
}
