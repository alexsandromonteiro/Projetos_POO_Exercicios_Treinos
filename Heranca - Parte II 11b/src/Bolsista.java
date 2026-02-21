public class Bolsista extends Aluno {
    private float bolsa;

    // Métodos Principais
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " +
                this.getNome() + ".");
    }
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() +
        " é bolsista! " +
                "Pagamento facilitado.");
    }


    // Métodos Especiais
    public float getBolsa() {
        return this.bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
