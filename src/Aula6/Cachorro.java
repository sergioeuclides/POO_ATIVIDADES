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

public class Cachorro extends Mamifero implements AnimalDomesticado,AnimalEstimacao{
	String tamanho;
	String raca;
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
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
		return "latir";
	}
	public void alimentar(){
		System.out.println("raçao");
	}
	
	public void levarVeterinario(){
		System.out.println("Ida veterinario");
	}
	
	public void chamarVeterinario(){
		System.out.println("Chamar veterinario");
	}

	public void brincar(){
		System.out.println("Brincando");
	}
	
	public void levarPassear(){
		System.out.println("passeando");
	}

}
