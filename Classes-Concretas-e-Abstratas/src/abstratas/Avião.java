package abstratas;

public class Avião extends Veiculo {

	@Override
	public void ligar() {
		System.out.println("[Avião]: Ligado");
	}
	public void desligar() {
	System.out.println("[Avião]: Desligado");
	}
	public void decolar() {
		System.out.println("[Avião]: Decolando");
	}
}
