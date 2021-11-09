package objetos;

public class Disciplina {

	double nota[] = new double[4];
	String disciplina;
	
	
	public double media() {
		double notas = 0;
		
		for (int i =0; i < nota.length; i++) {
			notas = notas + nota[i];
			
		}
		
		return notas/4;
	}
	
	public double[] getNota() {
		return nota;
	}
	public void setNota(double[] nota) {
		this.nota = nota;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	@Override
	public String toString() {
		return  disciplina ;
	}
	
}
