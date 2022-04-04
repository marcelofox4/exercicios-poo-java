package fox.marcelo.exercicios.ex09Data.domain;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        boolean isValidaDia = dia > 0 && dia <= 31;
        boolean isValidaMes = mes > 0 && mes <= 12;
        // isValidaAno pode ser utilizado para qualquer ano depois de Cristo (D.C).
        boolean isValidaAno = ano > 0;

        if (isValidaDia && isValidaMes && isValidaAno) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
        }
    }

    public void displayData() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
