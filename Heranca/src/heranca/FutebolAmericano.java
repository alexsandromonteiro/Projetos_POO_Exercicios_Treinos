package heranca;

public class FutebolAmericano extends Pessoa {
	
  private String corCapacete = "Vermelho";
  
  public void setCorCapacete(String corCapacete) {
   this.corCapacete = corCapacete;
  }
  public String getCorCapacete() {
  return corCapacete;
  }
  
  public void arremessar() {
	 System.out.println("[QB]: arremessando.");
  }
  @Override
  public void correr() {
	  System.out.println("[QB]: Correndo");
  }
  
  public void sorrir() {
	 System.out.println("[QB]: Sorrindo ");
  }
}
