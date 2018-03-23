/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula4;

/**
 *
 * @author Sergio
 */


public class Gerente extends Funcionario{

	int senha;
	int numFuncionariosGerenciados;
	
	public boolean autentica(int senha){
		return true;
	}
	
}
 
