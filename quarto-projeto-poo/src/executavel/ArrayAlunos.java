package executavel;

import objetos.Aluno;
import objetos.Disciplina;

public class ArrayAlunos {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Kleber");
		aluno.setNomeEscola("Escola dos muambeiros");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Gatologia");
		double notas [] = {6.1,7.4,4.2,10};
		disciplina.setNota(notas);

		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Mineralogia Avançada");
		double notas1 [] = {0,8.9,9.6,9.9};
		disciplina2.setNota(notas1);

		aluno.getDisciplinas().add(disciplina2);
		
		//---------------------------------------------------
		
		Aluno[] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for (int pos = 0; pos < arrayAlunos.length; pos ++) {
			
			System.out.println("O nome do aluno é: " + arrayAlunos[pos].getNome());
			
			for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina é: " + d.getDisciplina());
			
				for (int posi = 0; posi< d.getNota().length; posi ++ ) {
					System.out.println("Com nota " + (posi + 1)+ " igual a: " + d.getNota()[posi]);
				}
			}
		}
	}	
}
