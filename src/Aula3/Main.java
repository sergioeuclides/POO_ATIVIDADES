/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula3;

/**
 *
 * @author Sergio
 */
public class Main {
    public static void main(String[] args){
        Carro c1=new Carro(); //criar objeto utilizando padrao
        Carro c2=new Carro("Ferrari","vermelha","abc123",100,1,true,true);
        
        System.out.println("CARRO 2: ANTES DE ATUALIZAR\n"+c2.toString());
        
        c1.Ligar();c1.acelerar(100);c1.mudarMarcha(4);c1.Parar(); //metodo ligar
        System.out.println("CARRO 1: \n"+c1.toString());
        
//carro 2 ligar modificado
        c2.Ligar();c2.acelerar(300);c2.mudarMarcha(5);c2.Parar(); 
        System.out.println("CARRO 2: ATUALIZADO\n"+c2.toString());
    }
    
}
