package setget_meu;

public class VideoGameTestar {

	public static void main(String[] args) {
		
		VideoGame videogame = new VideoGame();
		
		videogame.setNomeVideogame("Playstation 4");
		videogame.setMarca("Sony");
		videogame.setPreco(3442.67f);
		
		System.out.println("Nome: " + videogame.getNomeVideogame() + "\nMarca: " + videogame.getMarca()
		+ "\npreço: " + videogame.getPreco());

	}

}
