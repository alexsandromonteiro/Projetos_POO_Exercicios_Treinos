public class Tecnico extends Aluno {
    private int registroProfissional;


    // Métodos Principais
    public void praticar() {
        System.out.println("O " + this.getNome() + " está praticando.");
    }

    // Métodos Especiais
    public int getRegistroProfissional() {
        return this.registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return "Tecnico [" +
                "Registro Profissional=" + this.getRegistroProfissional() +
                ", nome=" + this.getNome() + ", sexo=" + this.getSexo() +
                ", curso=" + this.getCurso() +
                ']';
    }
}
