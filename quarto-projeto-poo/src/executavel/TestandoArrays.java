package executavel;

import objetos.Aluno;
import objetos.Disciplina;

public class TestandoArrays {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Tom hanks");
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
		
		
		
		System.out.println("O nome do aluno é: " + aluno.getNome());
		System.out.println("Estuda em: " + aluno.getNomeEscola());
		System.out.println("-------------Disciplinas do Aluno---------------");
		
		for (Disciplina d : aluno.getDisciplinas()) {
			double notaMax = 0;
			double notaMin = 10;
			System.out.println("Disciplina: " + d.getDisciplina());
			for (int pos = 0 ; pos < d.getNota().length; pos ++) {
				System.out.println("Nota "+ (pos+1) + " é: " + d.getNota()[pos]);
				
				if(pos == 0) {
					notaMax = d.getNota()[pos];
				}else {
				if (d.getNota()[pos] > notaMax) {
					notaMax = d.getNota()[pos];
				}
				}
				
				if(pos == 0) {
					notaMin = d.getNota()[pos];
				}else {
				if (d.getNota()[pos] < notaMin) {
					notaMin = d.getNota()[pos];
				}
				}
		}
			System.out.println("Com média igual a: " + d.media() );
			System.out.println("A maior nota é: " + notaMax);
			System.out.println("A menor nota é: " + notaMin);
			
	}
	}
}
