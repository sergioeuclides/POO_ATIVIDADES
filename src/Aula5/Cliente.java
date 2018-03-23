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

public abstract class Cliente extends Pessoa implements Autenticavel{

	double saldo;
	double limite;
	double chequeEspecial;
	
	public void sacar(){}
	public void depositar(){}
	
	
}
