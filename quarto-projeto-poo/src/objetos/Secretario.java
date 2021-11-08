package objetos;

import interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

	String registro;
	String cargo;
	int experiencia;
	
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 3000;
	}
	
	@Override
	public boolean autenticar(String nLogin, String nSenha) {
		// TODO Auto-generated method stub
		return nLogin.equals("admin") && nSenha.equals("admin");
	}
	
	
}
