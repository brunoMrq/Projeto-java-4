package objetos;

public class Aluno extends Pessoa {

	String dataMatricula;
	String nomeEscola;
	int serieMat;
	String disciplinas;
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public int getSerieMat() {
		return serieMat;
	}
	public void setSerieMat(int serieMat) {
		this.serieMat = serieMat;
	}
	public String getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	@Override
	public boolean maiorIdade() {
	 return idade >= 14;
}
	public String msgMaiorIdade() {
		return this.maiorIdade()? "Pode dirigir" : "Não pode dirigir";
	}
	@Override
	public double salario() {
		return 0;
	}

	
}