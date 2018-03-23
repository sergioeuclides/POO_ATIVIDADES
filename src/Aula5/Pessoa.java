/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula5;

/**
 *
 * @author Sergio
 */


public class Pessoa {

	protected String Nome;
	protected int idade;
	protected String cpf;	


	public String getNome() {
		return Nome;
}
	public void setNome(String nome) {
		Nome = nome;
}
	public int getIdade() {
		return idade;
}
	public void setIdade(int idade) {
		this.idade = idade;
}
	public String getCpf() {
		return cpf;
}
	public void setCpf(String cpf) {
		this.cpf = cpf;
}


}
