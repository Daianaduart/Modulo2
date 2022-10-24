package br.com.crud.model;

public class Cliente {
	private int IdCliente;
	private String Nome;
	private int idade;
	private String Cpf;
	private String Email;
	
	public int getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(int IdCliente) {
		this.IdCliente = IdCliente;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String Cpf) {
		this.Cpf =Cpf;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
			
	}
	
	
	
	
}
