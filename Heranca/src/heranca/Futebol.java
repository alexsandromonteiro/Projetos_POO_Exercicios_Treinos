package heranca;

public class Futebol extends Pessoa {

	private int tamanhoChuteira = 40;
	
	public void setTamanhoChuteira(int tamanhoChuteira) {
	this.tamanhoChuteira = tamanhoChuteira;
	}
	public int getTamanhoChuteira() {
	 return tamanhoChuteira;
	}
	public void chutar() {
	 System.out.println("[Atacante]: Chutando.");
	}
	@Override
	  public void correr() {
		  System.out.println("[Atacante]: Correndo");
	  }
}
