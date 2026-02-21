package abstratas;

public class Onibus extends Veiculo {

	@Override
	public void desligar() {
	System.out.println("[Onibus]: Desligado");
	}
	public void ligar() {
	System.out.println("[Onibus]: Ligado");
	}
	@Override
	public void locomover() {
	System.out.println("[Onibus]: Locomovendo");
	}
}
