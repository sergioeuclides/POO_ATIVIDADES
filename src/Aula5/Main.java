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
public class Main {

	public static void main(String[] args) {
		
            Gerente g = new Gerente();
            g.setSenha(1234);
		//testa de autenticaçao de senha do gerente
		System.out.println(g.autentica(1234));//espera true
                System.out.println(g.autentica(4321));//espera false
	}

}
