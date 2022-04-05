package fox.marcelo.exercicios.ex11Data.domain;

import java.util.Calendar;

public class Data implements Cloneable{

    private String dia;
    private String mes;
    private String ano;

    public Data(String dia, String mes, String ano) {
        boolean isValidaDia = Integer.parseInt(dia) > 0 && Integer.parseInt(dia) <= 31;
        boolean isValidaMes = Integer.parseInt(mes) > 0 && Integer.parseInt(mes) <= 12;
        boolean isValidaAno = Integer.parseInt(ano) > 0;

        if (isValidaDia && isValidaMes && isValidaAno) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = "01";
            this.mes = "01";
            this.ano = "0001";
        }
    }

    public int compara(Data data) {
        int dia = Integer.parseInt(data.getDia());
        int mes = Integer.parseInt(data.getMes());
        int ano = Integer.parseInt(data.getAno());

        Calendar dataCorrente = Calendar.getInstance();

        boolean isDataECorrente = dia == dataCorrente.get(Calendar.DAY_OF_MONTH) &&
                (mes - 1) == dataCorrente.get(Calendar.MONTH) &&
                ano == dataCorrente.get(Calendar.YEAR);

        if (isDataECorrente) {
            return 0;
        }

        if (dataCorrente.get(Calendar.YEAR) > ano) {
            return 1;
        } else if (dataCorrente.get(Calendar.MONTH) > mes) {
            return 1;
        } else if (dataCorrente.get(Calendar.DAY_OF_MONTH) > dia) {
            return 1;
        }

        return -1;
    }

    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public String getAno() {
        return ano;
    }

    public String getMesExtenso() {
        if (getDia().equals("01") && getMes().equals("01") && getAno().equals("0001")) {
            return "01/01/001";
        }
        switch (Integer.parseInt(getMes())) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
        }
        return "";
    }

    public boolean isBissexto() {
        Calendar dataCorrente = Calendar.getInstance();
        int anoCorrente = dataCorrente.get(Calendar.YEAR);
        if ((anoCorrente % 4 == 0) && (anoCorrente % 100 != 0)  || (anoCorrente % 400 == 0)) {
            return true;
        }
        return false;
    }

    public Data clone(Data data){
        return data;
    }

    @Override
    public Data clone() throws CloneNotSupportedException {
        return (Data) super.clone();
    }

    @Override
    public String toString() {
        return "Data{" +
                "dia='" + dia + '\'' +
                ", mes='" + mes + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }
}
