package heranca;

public class Pessoa {

	private String nome;
	private String sobrenome;
	
	public void andar() {
	System.out.println("[Pessoa]: Andando");
	}
	public void falar() {
		System.out.println("[Pessoa]: falando");
	}
	public void sorrir() {
		System.out.println("[Pessoa]: sorrindo");
	}
	public void correr() {
		System.out.println("[Pessoa]: Correndo");
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
	 return nome;
	}
	
	public void setSobreNome(String sobrenome) {
	 this.sobrenome = sobrenome;
	}
	public String getSobreNome() {
	 return sobrenome;
	}
}
