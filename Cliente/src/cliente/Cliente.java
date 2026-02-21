package cliente;

public class Cliente {

	String nome;
	int idade;
	String cpf;
	String cidade;
	String estado;
	
	Cliente() {
		
	}
	
	Cliente(String nome, int idade, String cpf, String cidade, String estado){
	 this.nome = nome;
	 this.idade = idade;
	 this.cpf = cpf;
	 this.cidade = cidade;
	 this.estado = estado;
	}
	void ClienteMostrar() {
	 System.out.println("Nome: " + nome + "| Idade: " + idade + "| cpf: " + cpf
	+ "| cidade: " + cidade + "| estado: " + estado);
	}
}
