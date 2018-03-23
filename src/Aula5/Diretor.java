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
public class Diretor extends Funcionario implements Autenticavel{
    private int senha;
    
    public boolean autentica(int senha){
        return true;
    }

    @Override
    public boolean atutentica(int senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
