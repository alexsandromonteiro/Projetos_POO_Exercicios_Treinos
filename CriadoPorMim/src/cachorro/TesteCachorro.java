package cachorro;

public class TesteCachorro {

	public static void main(String[] args) {
		Cachorro c1 = new Cachorro("Bob", "Marrom", 9, "Grande");
		System.out.println("Cachorro 1:");
		System.out.println("Nome: " +c1.getNome() + "\nCor: " + c1.getCorPelo() + 
				"\nIdade: " + c1.getIdade() + "\nPorte: " + c1.getPorte());
		c1.andar();
		c1.latir();
		c1.comer();
		
		Cachorro c2 = new Cachorro();
		c2.setNome("Lulu");
		c2.setCorPelo("Branco");
		c2.setIdade(5);
		c2.setPorte("Pequeno");
		System.out.println("\nCachorro 2:");
		System.out.println("Nome: " +c2.getNome() + "\nCor: " + c2.getCorPelo() + 
				"\nIdade: " + c2.getIdade() + "\nPorte: " + c2.getPorte());
		c2.andar();
		c2.comer();
		c2.latir();
		

	}

}
