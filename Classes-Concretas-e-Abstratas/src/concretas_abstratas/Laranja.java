package concretas_abstratas;
import java.util.Scanner;
/**
 A classe laranja (concreta) est� herdando os atributos da classe comida (abstrata)
 */
public class Laranja extends Comida {
	Scanner input = new Scanner(System.in);
	
	/*M�todos abstratos
	public void comerOQue() {
	System.out.println("Coma laranja");
	}
	public void voceComeu() {
	String Resposta;
	System.out.println("\nVocê comeu?");
	Resposta = input.next();
	if(Resposta.equals("Sim") || Resposta.equals("sim") || Resposta.equals("S") || 
	Resposta.equals("s")) {
	System.out.println("Parabéns!");
	}
	else {
	  System.out.println("Vá comer");
	}
	}
	*/
	public static void main(String[] args) {
		//Instância
		Comida fruta1 = new Laranja();
		//fruta1.comerOQue();
		fruta1.comer();
		fruta1.satisfeito();
		//fruta1.voceComeu();
	}

}
