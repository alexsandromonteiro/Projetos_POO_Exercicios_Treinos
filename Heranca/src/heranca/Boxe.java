package heranca;

public class Boxe extends Pessoa {
private String marcaLuva = "Adidas";

public void setMarcaLuva(String marcaLuva) {
 this.marcaLuva = marcaLuva;
}
public String getMarcaLuva() {
 return marcaLuva;
}
public void socar() {
System.out.println("[Boxer]: Socando");
}

}
