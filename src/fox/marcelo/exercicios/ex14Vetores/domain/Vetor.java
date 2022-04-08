package fox.marcelo.exercicios.ex14Vetores.domain;

import java.util.Arrays;

public class Vetor {

    private String[] tamanho;

    public Vetor(int tamanhoInicial) {
        this.tamanho = new String[tamanhoInicial];
    }

    public void insert(String string) {
        for (int i = 0; i <= this.tamanho.length; i++) {
            String[] arrayAlternativo;
            if (i >= this.tamanho.length) {
                arrayAlternativo = new String[i + 1];
                for (int j = 0; j < this.tamanho.length; j++) {
                    if (arrayAlternativo[j] == null) {
                        arrayAlternativo[j] = this.tamanho[j];
                    }
                }
                this.tamanho = new String[this.tamanho.length + 1];
                this.tamanho = arrayAlternativo;
            }

            if (this.tamanho[i] == null) {
                this.tamanho[i] = string;
                return;
            }
        }
    }

    public String get(int index) {
        String retorno = null;
        for (int i = 0; i < this.tamanho.length; i++) {
            if (i == index) {
                retorno = this.tamanho[i];
            }

            if (index >= this.tamanho.length) {
                return retorno;
            }

            if (this.tamanho[i] == null) {
                return retorno;
            }
        }
        return retorno;
    }

    public int size() {
        return this.tamanho.length;
    }

    @Override
    public String toString() {
        return "Vetor{" +
                "tamanho=" + Arrays.toString(tamanho) +
                '}';
    }
}
