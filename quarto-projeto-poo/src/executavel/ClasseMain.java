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

		aluno.setNome("Chicão da construção");
		aluno.setIdade(14);
		
		diretor.setNome("O Corretivo");
		diretor.setIdade(55);
		
		/*secretario.setNome("Paulão da Secretaria");
		secretario.setIdade(18);*/
		String nLogin = JOptionPane.showInputDialog("Informe o Login: ");
		String nSenha = JOptionPane.showInputDialog("Informe a Senha: ");
		/*secretario.setLogin(nLogin);
		secretario.setSenha(nSenha);
		
		System.out.println("O aluno é: " + aluno.getNome() +" e o diretor é: "+ diretor.getNome() 
		+" e o secretário é: "+ secretario.getNome());
		
		System.out.println(" O aluno é maior de idade? " + aluno.maiorIdade() + aluno.msgMaiorIdade());
		System.out.println(" O diretor é maior de idade? " + diretor.maiorIdade());
		System.out.println(" O Secretário é maior de idade? " + secretario.maiorIdade());
		
		System.out.println("O salário do aluno é: " + aluno.salario());
		System.out.println("O salário do diretor é: " + diretor.salario());
		System.out.println("O salário do secretario é: " + secretario.salario());*/
	
		if (secretario.autenticar(nLogin, nSenha)) {
			System.out.println("Bem vindo secretário");
		}else {
			System.out.println("Senha incorreta");
		}
	}

}
