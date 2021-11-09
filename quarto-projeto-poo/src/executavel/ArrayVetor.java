package executavel;

import javax.swing.JOptionPane;

import objetos.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		Disciplina disciplina = new Disciplina();
		
		String discNome = JOptionPane.showInputDialog("Qual o nome da disciplina ? ");
		disciplina.setDisciplina(discNome);
		
		
		double notas [] = new double [4]; 
		double nota = 0;
		
		for (int i=0 ; i<notas.length ; i++) {
			
			String posText = JOptionPane.showInputDialog("Digite a nota " +(i+1));
			double pos1 = Double.parseDouble(posText) ;
			notas[i] = pos1;
			System.out.println("A nota "+ (i+1) +" é: "+notas[i]);
		}
		
		disciplina.setNota(notas);
		
		for (int e=0 ; e<disciplina.getNota().length ; e++) {
			
		nota = (disciplina.getNota()[e] + nota);
			
		}
		
		double med = (nota/notas.length);
		System.out.println("-------------------------------");
		System.out.println("A disciplina é: " + disciplina.getDisciplina());
		System.out.println("A média é " + med);
		
	}
	
}
