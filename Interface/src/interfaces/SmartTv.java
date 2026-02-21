package interfaces;

public class SmartTv implements Televisão, Smart {

	@Override
	public void ligar() {
	System.out.println("[SmartTv]: ligada");	
	}
	@Override
	public void desligar() {
	System.out.println("[SmartTv]: desligada");
	}
	@Override
	public void alterarVolume() {
	System.out.println("[SmartTv]: alterando o volume");
	}
	@Override
	public void alterarCanal() {
	System.out.println("[SmartTv]: alterando o canal");
	}
	@Override
	public void acessarInternet() {
	System.out.println("[SmartTv]: Internet conectada");	
	}
	@Override
	public void baixarApp() {
	System.out.println("[SmartTv: Lista de Apps dispon�veis");
	}

}
