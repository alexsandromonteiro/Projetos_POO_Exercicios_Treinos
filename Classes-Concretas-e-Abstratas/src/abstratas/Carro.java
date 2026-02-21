package abstratas;

public class Carro extends Veiculo {

	@Override //Sobrecarregando o método ligar() da classe Veiculo (pai)
	public void ligar() {
	System.out.println("[Carro]: Ligado");
	}
	@Override //Sobrecarregando o método desligar() da classe Veiculo (pai)
	public void desligar() {
		System.out.println("[Carro]: Desligado");
		}
	@Override  //Sobrecarregando o método locomover() da classe Veiculo (pai)
	public void locomover() {
	 System.out.println("[Carro]: Locomovendo");
	}
}
