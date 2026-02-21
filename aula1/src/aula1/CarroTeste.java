package aula1;

public class CarroTeste extends Carro {

	public static void main(String[] args) {
	Carro c1 = new Carro();
	
	c1.nome = "Corolla";
	c1.marca = "Toyota";
	c1.ano = 2015;
	c1.vel = 60;
	
	System.out.println("Nome do carro: " + c1.nome + "| Marca: " + c1.marca + "| ano: " + c1.ano);
	
	System.out.println("Velocidade definida: " + c1.vel + "km/h");
	c1.acelerar(10);
	
	
	System.out.println("Acelerou +10");
	System.out.println("A velocidade é: " + c1.vel + "km/h");
	
	c1.freiar(30);
	System.out.println("reduziu -30");
	System.out.println("A velocidade é: " + c1.vel + "km/h");
	
	c1.businar();

	}

}
