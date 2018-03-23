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
    public boolean autentica(int senha){
        if(this.senha!=senha){
            return false;}
        
        return true;}

    @Override
    public boolean atutentica(int senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
	
}
 
