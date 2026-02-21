package interfaces;

public class OldTv implements Televisão {

	@Override
	public void ligar() {
		System.out.println("[OldTv]: ligada");	
	}

	@Override
	public void desligar() {
	System.out.println("[OldTv]: Desligada");
		}

	@Override
	public void alterarVolume() {
	System.out.println("[OldTv]: mudando o volume");
	}

	@Override
	public void alterarCanal() {
	System.out.println("[OldTv]: mudando o canal");
	}

	
}
