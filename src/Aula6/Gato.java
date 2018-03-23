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


public class Gato extends Mamifero implements AnimalDomesticado,AnimalEstimacao{
	
	String raca;
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public void amamentar (){
		System.out.println("mamado");
	}
	public String emitirSom(){
		return "miar";
	}
	public void alimentar(){
		System.out.println("raçao");
	}
	
	public void levarVeterinario(){
		System.out.println("levarVeterinario");
	}
	
	public void chamarVeterinario(){
		System.out.println("chamarVeterinario");
	}

	public void brincar(){
		System.out.println("Brincando");
	}
	
	public void levarPassear(){
		System.out.println("Passeando");
	}
	
}

