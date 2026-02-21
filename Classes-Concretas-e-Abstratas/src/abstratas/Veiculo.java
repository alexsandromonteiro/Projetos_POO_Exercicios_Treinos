package abstratas;

public abstract class Veiculo {
 private String cor = "Verde";
 private int qtdPessoas = 5;
 
 public void setCor(String cor) {
 this.cor = cor;
 }
 public String getCor() {
	return cor;
 }
 
 public void setQtdPessoas(int qtdPessoas) {
	this.qtdPessoas = qtdPessoas;
 }
 
 public int getQtdPessoas() {
	return qtdPessoas;
 }
 
 //M�todos abstratos
 public abstract void ligar();
 public abstract void desligar();
 
 public void locomover() {
	 System.out.println("[Veículo]: locomovendo");
	  }
}
