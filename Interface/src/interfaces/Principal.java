package interfaces;

public class Principal {

	public static void main(String[] args) {
	SmartTv smart = new SmartTv();
	smart.alterarCanal();
	smart.acessarInternet();
	
	
	OldTv old = new OldTv();
	old.alterarVolume();
	}

}
