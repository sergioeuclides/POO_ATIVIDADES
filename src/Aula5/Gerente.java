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


public class Gerente extends Funcionario implements Autenticavel{

	private int senha;
        private int numFuncionariosGerenciados;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumFuncionariosGerenciados() {
        return numFuncionariosGerenciados;
    }

    public void setNumFuncionariosGerenciados(int numFuncionariosGerenciados) {
        this.numFuncionariosGerenciados = numFuncionariosGerenciados;
    }
	//atualizar
    public boolean autentica(int senha){//override da interface? subir atutentica para abstract funcionario
        if(this.senha!=senha){
            return false;}
        
        return true;
    }
    
	
}
 
