public class Professor extends Pessoa {

    private String especialidade;
    private float salario;

    // Métodos Principais
    public float receberAumento(float aum) {
        this.salario += aum;
        return this.salario;
    }

    // Métodos Especiais

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor [" +
                "nome=" + this.getNome() + ", idade=" + this.getIdade() +
                ", sexo=" + this.getSexo() +
                ", especialidade=" + this.especialidade +
                ", salario=" + this.salario +
                ']';
    }
}
