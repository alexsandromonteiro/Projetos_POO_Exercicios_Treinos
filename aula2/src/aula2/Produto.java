package aula2;

public class Produto {

	//atributos
	String nome;
	String marca;
	float valor;
	
	//construtores
	Produto() {
	 
	}
	
	//Método que recebe um parâmetro
	 Produto(String nome) {
		/*Esse nome do atributo é igual
		ao nome que eu estou recebendo por par�metro.
		*/
		this.nome = nome;
	}
	
	//Método que recebe dois parâmetros
	Produto(String nome, String marca) {
	this.nome = nome;
	this.marca = marca;
	}
	
	//Método que recebe três parâmetros
 Produto(String nome, String marca, float valor) {
	 this.nome = nome;
	 this.marca = marca;
	 this.valor = valor;
	}
}
