package executavel;

import javax.swing.JOptionPane;

import interfaces.PermitirAcesso;
import objetos.Aluno;
import objetos.Secretario;
import objetos.Diretor;


public class ClasseMain {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		Diretor diretor = new Diretor();
		
		PermitirAcesso secretario = new Secretario();

		aluno.setNome("Chic�o da constru��o");
		aluno.setIdade(14);
		
		diretor.setNome("O Corretivo");
		diretor.setIdade(55);
		
		/*secretario.setNome("Paul�o da Secretaria");
		secretario.setIdade(18);*/
		String nLogin = JOptionPane.showInputDialog("Informe o Login: ");
		String nSenha = JOptionPane.showInputDialog("Informe a Senha: ");
		/*secretario.setLogin(nLogin);
		secretario.setSenha(nSenha);
		
		System.out.println("O aluno �: " + aluno.getNome() +" e o diretor �: "+ diretor.getNome() 
		+" e o secret�rio �: "+ secretario.getNome());
		
		System.out.println(" O aluno � maior de idade? " + aluno.maiorIdade() + aluno.msgMaiorIdade());
		System.out.println(" O diretor � maior de idade? " + diretor.maiorIdade());
		System.out.println(" O Secret�rio � maior de idade? " + secretario.maiorIdade());
		
		System.out.println("O sal�rio do aluno �: " + aluno.salario());
		System.out.println("O sal�rio do diretor �: " + diretor.salario());
		System.out.println("O sal�rio do secretario �: " + secretario.salario());*/
	
		if (secretario.autenticar(nLogin, nSenha)) {
			System.out.println("Bem vindo secret�rio");
		}else {
			System.out.println("Senha incorreta");
		}
	}

}
