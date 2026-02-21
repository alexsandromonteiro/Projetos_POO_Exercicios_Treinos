public class Principal {
    public static void main(String[] args) {

        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();

        /*v1.setNome("Marcos");
        v1.setIdade(23);
        v1.setSexo("M");
        System.out.println(v1.toString());
    */
        //v1.fazerAniv();


        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();

        /*Professor pf1 = new Professor();
        pf1.setNome("Jorge");
        pf1.setIdade(47);
        pf1.setEspecialidade("Matemática");
        pf1.setSalario(3500.50f);
        pf1.setSexo("M");
        System.out.println("\n" + pf1.toString());
    */

        Tecnico t1 = new Tecnico();
        t1.setNome("Nardo");
        t1.setCurso("Engenharia Civil");
        t1.setSexo("M");
        t1.setMatricula(33391);
        t1.setRegistroProfissional(62276432);

        System.out.println("\n" + t1.toString());
        t1.praticar();



    }
}
