package objetos;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Aluno extends Pessoa {

		int idade;
		String nome;
		String numCpf;
		String dataNascimento;
		String numRg;
		String nomePai;
		String nomeMae;
		String nomeEscola;
		String serieMatriculado;
		
		private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

		public Aluno() {};
		
		public Aluno (String nomes){
			nome = nomes;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getNumCpf() {
			return numCpf;
		}

		public void setNumCpf(String numCpf) {
			this.numCpf = numCpf;
		}

		public String getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

		public String getNumRg() {
			return numRg;
		}

		public void setNumRg(String numRg) {
			this.numRg = numRg;
		}

		public String getNomePai() {
			return nomePai;
		}

		public void setNomePai(String nomePai) {
			this.nomePai = nomePai;
		}

		public String getNomeMae() {
			return nomeMae;
		}

		public void setNomeMae(String nomeMae) {
			this.nomeMae = nomeMae;
		}

		public String getNomeEscola() {
			return nomeEscola;
		}

		public void setNomeEscola(String nomeEscola) {
			this.nomeEscola = nomeEscola;
		}

		public String getSerieMatriculado() {
			return serieMatriculado;
		}

		public void setSerieMatriculado(String serieMatriculado) {
			this.serieMatriculado = serieMatriculado;
		}
		
		public double getMediaNota() {
			
			double somaNotas = 0.0;
			for (Disciplina disciplina : disciplinas) {
				somaNotas += disciplina.media();
			}
			
			return somaNotas/ disciplinas.size();
		}
		

		public List<Disciplina> getDisciplinas() {
			return disciplinas;
		}

		public void setDisciplinas(List<Disciplina> disciplinas) {
			this.disciplinas = disciplinas;
		}

		public String getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 5) {
			if (media >=7) {
				return " Aprovado ";
			}else {
				return "Recuperação";
			}
		}
		else {
			return " Reprovado ";
		}
		}

		@Override
		public int hashCode() {
			return Objects.hash(nome);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aluno other = (Aluno) obj;
			return Objects.equals(nome, other.nome);
		}

		@Override
		public String toString() {
			return "Aluno " + nome ;
		}

		@Override
		public double salario() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
		
		
	}