public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos Especiais
    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(true);
        this.setTocando(false);
    }
    private int getVolume() {
        return this.volume;
    }
    private void setVolume(int v) {
        this.volume = v;
    }
    private boolean isLigado() {
        return this.ligado;
    }
    private void setLigado(boolean l) {
        this.ligado = l;
    }
    private boolean isTocando() {
        return this.tocando;
    }
    private void setTocando(boolean t) {
        this.tocando = t;
    }

    // Métodos Abstratos
    @Override
    public void ligar() {
    this.setLigado(true);
    }

    @Override
    public void desligar() {
    this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.isLigado()) {
            System.out.println("------- MENU -------");
            System.out.println("Está ligado? " + this.isLigado());
            System.out.println("Está tocando? " + this.isTocando());
            System.out.print("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");

            }
        } else {
            System.out.println("Impossível abrir o menu.");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
    if(this.isLigado()) {
        this.setVolume(this.getVolume() + 5);
    }
    else {
        System.out.println("Impossível aumentar volume");
    }
    }

    @Override
    public void menosVolume() {
    if(this.isLigado()) {
    this.setVolume(this.getVolume() - 5);
    }
    else {
        System.out.println("Impossível diminuir volume");
    }
    }

    @Override
    public void ligarMudo() {
    if(this.isLigado() && this.getVolume() > 0) {
        this.setVolume(0);
    }
    }

    @Override
    public void desligarMudo() {
    if(this.isLigado() && this.getVolume() == 0) {
        this.setVolume(50);
    }
    }

    @Override
    public void play() {
    if(this.isLigado() && !(this.isTocando())) {
        this.setTocando(true);
    } else {
        System.out.println("Não consegui reproduzir");
    }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        }
        else {
            System.out.println("Não consegui pausar");
        }

    }


}
