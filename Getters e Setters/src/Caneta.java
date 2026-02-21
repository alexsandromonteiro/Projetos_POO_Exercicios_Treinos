public class Caneta {
   private String modelo;
   private float ponta;
   private String cor;

   private boolean tampada;


   public Caneta(String m, String c, float p) { // Este é o método construtor
    this.setModelo(m);
    this.setCor(c);
    this.setPonta(p);
    this.tampar();
    /*Outra alternativa para receber os parâmetros nos atributos
       this.modelo = m;
       this.cor = c;
       this.ponta = p;

     */

   }

   public void status() {
       System.out.println("----------------------------");
       System.out.println("Sobre a CANETA:");
       System.out.println("Modelo: " + this.getModelo());
       System.out.println("Ponta: " + this.getPonta());
       System.out.println("Cor: " + this.getCor());
       System.out.println("Tampada: " + this.isTampada());
   }

   public String getModelo() {
       return this.modelo;
   }
   public void setModelo(String m) {
       this.modelo = m;
   }

   public float getPonta() {
       return this.ponta;
   }

   public void setPonta(float p) {
       this.ponta = p;
   }
   public boolean isTampada() {
       return this.tampada;
   }
   public void setTampada(boolean t) {
       this.tampada = t;
   }
   public String getCor() {
       return this.cor;
   }
   public void setCor(String c) {
       this.cor = c;
   }
    public void tampar() {
        this.setTampada(true);
        //this.tampada = true;
    }
   public void destampar() {
       this.setTampada(false);
       //this.tampada = false;
   }

}
