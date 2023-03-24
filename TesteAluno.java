package cadastro.aluno;

public class TesteAluno {

	public static void main(String[] args) {
	
		Aluno a1 = new Aluno();
		System.out.println("Matricula: " + a1.getMatricula());
		System.out.println("Nome: " + a1.getNome());
		System.out.println("Curso: " + a1.getCurso());
		System.out.println("Status: " + a1.getStatus());
		System.out.println("Média: " + a1.getMediaGeral());
		
		System.out.println("");
		
		Aluno a2 = new Aluno(123, "Gabriel");
		System.out.println("Matricula: " + a2.getMatricula());
		System.out.println("Nome: " + a2.getNome());
		System.out.println("Curso: " + a2.getCurso());
		System.out.println("Status: " + a2.getStatus());
		System.out.println("Média: " + a2.getMediaGeral());
		
		System.out.println("");
		
		Aluno a3 = new Aluno(231, "Alef", "ADS", true);
		System.out.println("Matricula: " + a3.getMatricula());
		System.out.println("Nome: " + a3.getNome());
		System.out.println("Curso: " + a3.getCurso());
		System.out.println("Status: " + a3.getStatus());
		System.out.println("Média: " + a3.getMediaGeral());
		System.out.println("Média alterada: ");
		a3.setMediaGeral(a3.calcularMedia(5, 6, 9));
		System.out.println("Média: " + a3.getMediaGeral());
		
		

	}

}
