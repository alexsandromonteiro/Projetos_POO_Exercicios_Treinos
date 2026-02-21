package aula1;

public class Carro {

//atributos = Características de um objeto
	String nome;
	String marca;
	int ano;
	int vel;
	
	//métodos = Ações que o objeto pode realizar
	 void acelerar(int aceleracao) {
	vel+=aceleracao;
	}
	
	void freiar(int reduzir) {
		vel-=reduzir;
	}
	void businar() {
		System.out.println("bibibi");
	}
	
}
