package fox.marcelo.exercicios.ex07ControleRemoto.domain;

public class ControleRemoto {

    private Televisao televisao;

    public ControleRemoto() {
        this.televisao = new Televisao(20, 9);
        System.out.println("Televisão Ligada");
        System.out.println(this.televisao);
    }

    public void volume(String controleVolume) {
        if (controleVolume.equalsIgnoreCase("+")) {
            this.televisao.setVolume(this.televisao.getVolume() + 1);
            return;
        }

        if (controleVolume.equalsIgnoreCase("-")) {
            this.televisao.setVolume(this.televisao.getVolume() - 1);
            return;
        }
    }

    public void canal(String controleCanal) {
        if (controleCanal.equalsIgnoreCase("+")) {
            this.televisao.setCanal(this.televisao.getCanal() + 1);
            return;
        }

        if (controleCanal.equalsIgnoreCase("-")) {
            this.televisao.setCanal(this.televisao.getCanal() - 1);
            return;
        }
    }

    public void escolherCanal(int canalEscolhido) {
        this.televisao.setCanal(canalEscolhido);
    }

    public void consultarVolumeCanal() {
        System.out.println(this.televisao);
    }
}
