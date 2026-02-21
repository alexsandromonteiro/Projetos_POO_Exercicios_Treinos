package aula3;

public class AlunoTestar {

public static void main(String[] args) {
	
	Aluno aluno = new Aluno();
	
	//aluno.nome = "Elena";
	aluno.setNome("Elena");
    
	System.out.println("Nome: " + aluno.getNome());
	
	aluno.setIdade(23);
	
}
}
