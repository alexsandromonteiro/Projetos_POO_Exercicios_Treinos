package aula2;

public class ProdutoTestar {

public static void main(String[] args) {

	//Construtor padrão
	Produto p1 = new Produto();
	p1.nome = "Notebook";
	p1.marca = "Acer";
	p1.valor = 2938.56f;
	
	//Construtor de dois parâmetros
	Produto p2 = new Produto("L�pis", "Faber Castel");
	p2.valor = 1.59f;
	
	//Construtor de três parâmetros
	Produto p3 = new Produto("Playstation 4", "Sony", 3499.00f);
	
	//Objeto p1
	System.out.println("Nome:" + p1.nome + "| Marca:" + p1.marca 
			+ "| Valor:" + p1.valor);
	
	//Objeto p2
		System.out.println("Nome:" + p2.nome + "| Marca:" + p2.marca 
		 + "| Valor:" + p2.valor);
		
	//Objeto p3
	System.out.println("Nome:" + p3.nome + "| Marca:" + p3.marca 
	+ "| Valor:" + p3.valor);
}
}
