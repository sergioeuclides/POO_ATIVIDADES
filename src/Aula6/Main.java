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


public class Main {

	public static void main(String[] args) {
		
		Papagaio ave = new Papagaio();//teste animal papagaio 
		
		System.out.println(ave.getEmitirSom());//string em classe papagaio extendido de ave
		ave.voar();//void em classe ave

	}

}
