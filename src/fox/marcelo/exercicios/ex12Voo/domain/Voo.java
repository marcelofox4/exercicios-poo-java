package fox.marcelo.exercicios.ex12Voo.domain;

import fox.marcelo.exercicios.ex11Data.domain.Data;

import java.util.Arrays;

public class Voo implements Cloneable{

    private Data data;
    private int numero;
    private String[] quantidadePassageiros;

    public Voo(int numero, Data data) {
        this.numero = numero;
        this.data = data;
        this.quantidadePassageiros = new String[100];
    }

    public int proximoLivre() {
        for (int i = 0; i < this.quantidadePassageiros.length; i++) {
            if (this.quantidadePassageiros[i] == null) {
                return i;
            }
        }
        return 0;
    }

    public void verifica(int numeroCadeira) {
        for (int i = 0; i < quantidadePassageiros.length; i++) {
            if (numeroCadeira == i) {
                if (quantidadePassageiros[i] != null) {
                    System.out.println("Assento:" + i + " Ocupado!");
                    return;
                } else {
                    System.out.println("Assento:" + i + " Livre!");
                    return;
                }
            }
        }
    }

    public boolean ocupa(int numeroCadeira) {
        for (int i = 0; i < quantidadePassageiros.length; i++) {
            if (numeroCadeira == i) {
                if (quantidadePassageiros[i] == null) {
                    quantidadePassageiros[i] = "Assento:" + i + " Ocupado!";
                    return true;
                }
            }
        }
        return false;
    }

    public int vagas() {
        int contaCadeirasVagas = 0;
        for (int i = 0; i < quantidadePassageiros.length; i++) {
            if (quantidadePassageiros[i] == null) {
                contaCadeirasVagas++;
            }
        }
        return contaCadeirasVagas;
    }

    public int getVoo() {
        return numero;
    }

    public Data getData() {
        return this.data;
    }

    @Override
    public Voo clone() throws CloneNotSupportedException {
        return (Voo) super.clone();
    }

    @Override
    public String toString() {
        return "Voo{" +
                "data=" + data +
                ", numero=" + numero +
                ", quantidadePassageiros=" + Arrays.toString(quantidadePassageiros) +
                '}';
    }
}
