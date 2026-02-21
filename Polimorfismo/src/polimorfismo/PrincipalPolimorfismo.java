package polimorfismo;

public class PrincipalPolimorfismo {

	public static void main(String[] args) {
	Transporte t = new Transporte();
	Veiculo v = new Veiculo();
	Carro c = new Carro();
	System.out.println("Passando Transporte:");
	moverTransporte(t);
	System.out.println("Passando Veículo :");
	moverTransporte(v);
	System.out.println("Passando Carro:");
	moverTransporte(c);
	}
	static void moverTransporte(Transporte trans) {
	System.out.println(trans.mover());
		
	}

}
