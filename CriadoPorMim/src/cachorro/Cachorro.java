package cachorro;

public class Cachorro {

private String nome;
private String corPelo;
private int idade;
private String porte;

//Construtor padrão
Cachorro(){

}


//Construtor de 4 parâmetros
Cachorro(String nome, String corPelo, int idade, String porte) {
this.nome = nome;
this.corPelo = corPelo;
this.idade = idade;
this.porte = porte;
}

public void latir() {
System.out.println("Latindo");
}

public void andar() {
System.out.println("\nAndando");
}
public void comer() {
System.out.println("Comendo");
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCorPelo() {
	return corPelo;
}

public void setCorPelo(String corPelo) {
	this.corPelo = corPelo;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public String getPorte() {
	return porte;
}

public void setPorte(String porte) {
	this.porte = porte;
}



}
