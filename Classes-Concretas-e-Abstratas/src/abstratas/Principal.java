package abstratas;

public class Principal {

	public static void main(String[] args) {
	//Veiculo v1 = new Veiculo(); (Uma classe abstrata não pode ter um objeto instanciado)
	Carro c1 = new Carro();
	Avião a1 = new Avião();
	Onibus o1 = new Onibus();
    
	//v1.ligar();
	c1.ligar();
	a1.ligar();
	o1.ligar(); //Utilizando o método ligar da classe abstrata Veiculo, pois o Onibus extende essa
	            //classe
	}

}
