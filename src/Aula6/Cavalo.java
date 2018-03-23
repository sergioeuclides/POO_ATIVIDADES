/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula6;

/**
 *
 * @author Sergio
 */
public class Cavalo extends Mamifero{
	
	public void amamentar (){
		System.out.println("mamado");
	}
	public String emitirSom(){
		return "relinchar";
	}
	public void alimentar(){
		System.out.println("Alimentar no pasto");
	}
	
	public void levarVeterinario(){
		System.out.println("levarVeterinario");
	}
	
	public void chamarVeterinario(){
		System.out.println("cavalo doente");
	}
	
	

}
