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
public class Secretario extends Funcionario {

	public double bonus(){
		this.salario = salario+(salario*0.01);
		return salario;
	}
	@Override //altera o metodo de funcionario de acordo com o especificado em scretario salario+bonus 10%
	public double getSalario(){
		double total=bonus();
		return total;
	}
	
}
