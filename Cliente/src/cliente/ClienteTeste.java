package cliente;

public class ClienteTeste {

	public static void main(String[] args) {
		//Cliente(construtor) com 5 par�metros
		Cliente cliente1 = new Cliente("José", 25, "222.111.444-09", "São Paulo", "SP");
		
		//Cliente(construtor) padr�o
		Cliente cliente2 = new Cliente();
		cliente2.nome = "Alex";
		cliente2.idade = 21;
		cliente2.cpf = "334.765.912-56";
		cliente2.cidade = "São Paulo";
		cliente2.estado = "SP";
		
		cliente1.ClienteMostrar();
		cliente2.ClienteMostrar();

	}

}
