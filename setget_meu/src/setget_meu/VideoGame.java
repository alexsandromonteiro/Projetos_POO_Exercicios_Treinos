package setget_meu;

public class VideoGame {

	private String nomevideogame;
	private String marca;
	private float preco;
	
	public void setNomeVideogame(String nomevideogame) {
	 this.nomevideogame = nomevideogame;
	}
	public String getNomeVideogame() {
		return nomevideogame;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	
	public void setPreco(float preco) {
	 this.preco = preco;
	}
	public float getPreco() {
		return preco;
	}
}
