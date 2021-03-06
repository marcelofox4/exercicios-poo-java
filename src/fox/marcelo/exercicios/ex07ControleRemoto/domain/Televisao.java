package fox.marcelo.exercicios.ex07ControleRemoto.domain;

public class Televisao {

    private int volume;
    private int canal;

    public Televisao(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return "Televisao{" +
                "volume=" + volume +
                ", canal=" + canal +
                '}';
    }
}
