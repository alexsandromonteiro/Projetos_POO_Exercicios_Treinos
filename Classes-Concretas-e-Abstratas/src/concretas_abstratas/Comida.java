package concretas_abstratas;
//Classe abstrata
public abstract class Comida {

/*public abstract void comer(); --> define um método abstrato que só pode ser
implementado em outra classe que herde da classe comida
*/
public void comer() {
System.out.println("\nEssa laranja está muito boa");
}
public void satisfeito() {
System.out.println("\nEstou satisfeito");
}
/*Método abstrato, ent�o terei que implementá-lo em outra classe herdada da classe comida
public abstract void comerOQue();
public abstract void voceComeu();
*/
}
