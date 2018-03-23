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

public class Cliente extends Pessoa implements Autenticavel{

	double saldo;
	double saque;
	double deposito;
	double limite;
	double chequeEspecial;
	
	public void sacar(double saldo, double saque){
		if(saldo>saque){
		saque=saldo -saque;
		}system.out.println("Saldo: T$"+saldo+" insuficiente para saque valor: "+saque);
	}
	public void depositar(double saldo, double deposito){
		saldo=saldo+deposito;
		system.out.println("Deposito no valor: T$"+deposito+"\nSaldo atual: T$"+saldo);
	}
	
	
}
