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

public class Papagaio extends Ave {
	//extends herança
	//implements interface
	String emitirSom;
	
	public void Voar() {
	}
	
	public String getEmitirSom() {
		return "UmaVexFRamengoXempreFRamengo";
	}
	public String getEmitirSom(String biscoito) {
		return "louroQuerBiscoito";
	}
	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}
	

}
