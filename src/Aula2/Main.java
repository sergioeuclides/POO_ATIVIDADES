/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula2;

/**
 *
 * @author Sergio
 */
public class Main {
    public static void main(String[] args){
        Carro c1=new Carro(); //criar objeto
    
        System.out.println("CARRO CONTRUTOR PADRAO:\nMarca: "+ c1.getMarca()+"\nCor: "
                +c1.getCor()+"\n"+"Placa: "+c1.getPlaca()+"\nVelocidade padrao: "
                +c1.getVelocidade_atual()+"\nMarcha padrao: "+c1.getMarcha_atual()
                +"\nFreio de mao Padrao:"+c1.isFreio_de_mao_Puxado()+"\nChave Padrao: "
                +c1.isChave_virada());
    
        c1.Ligar(); //metodo ligar
        System.out.println("\nCARRO METODO LIGAR: "+"\nMarcha"+c1.getMarcha_atual()
                +"\nVelocidade"+c1.getVelocidade_atual());
        
        c1.Parar();//metodo parar
        System.out.println("\nCARRO METODO PARAR: "+"\nMarcha"+c1.getMarcha_atual()
                +"\nVelocidade"+c1.getVelocidade_atual()
                +"\nFreio de mao:"+c1.isFreio_de_mao_Puxado()+
                "\nChave na inguiniçao: "+c1.isChave_virada());
    }
    
}
