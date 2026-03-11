public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    /** Metodos para ligar e desligar a TV */

    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }

    /** Metodos para aumentar e diminuir o volume */

    public void aumentarVolume() {
        volume++;
    }
    public void diminuirVolume() {
        volume--;
    }

    /** Metodos para mudar de canal */

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    /** Metodos para aumentar e diminuir o canal */

    public void aumentarCanal() {
        canal++;
    }
    public void diminuirCanal() {
        canal--;
    }
}
