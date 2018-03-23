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
public class Carro {
    
    protected String Marca;
    protected String Cor;
    protected String Placa;
    protected int Velocidade_atual;
    protected int Marcha_atual;
    protected boolean Freio_de_mao_Puxado;
    protected boolean Chave_virada;
    
    //contrutor padrao
    public Carro(){}
    //contrutor completo
    public Carro(String Marca, String Cor, String Placa, int Velocidade_atual, 
            int Marcha_atual, boolean Freio_de_mao_Puxado, boolean Chave_virada){
    this.Marca=Marca;
    this.Cor=Cor;
    this.Placa=Placa;
    this.Velocidade_atual=Velocidade_atual;
    this.Marcha_atual=Marcha_atual;
    this.Freio_de_mao_Puxado=Freio_de_mao_Puxado;
    this.Chave_virada=Chave_virada;
    
        
    }
    public String toString(){
        return "\nMarca: "+Marca+"\nCor: "+Cor+"\nPlaca: "+Placa+
                "\nVelocidade: "+Velocidade_atual+"\nMarcha Atual: "+Marcha_atual+
                "\nFreio Acionado: "+Freio_de_mao_Puxado+"\nChave Virada: "+Chave_virada+"\n";
    }
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public int getVelocidade_atual() {
        return Velocidade_atual;
    }

    public void setVelocidade_atual(int Velocidade_atual) {
        this.Velocidade_atual = Velocidade_atual;
    }

    public int getMarcha_atual() {
        return Marcha_atual;
    }

    public void setMarcha_atual(int Marcha_atual) {
        this.Marcha_atual = Marcha_atual;
    }

    public boolean isFreio_de_mao_Puxado() {
        return Freio_de_mao_Puxado;
    }

    public void setFreio_de_mao_Puxado(boolean Freio_de_mao_Puxado) {
        this.Freio_de_mao_Puxado = Freio_de_mao_Puxado;
    }

    public boolean isChave_virada() {
        return Chave_virada;
    }

    public void setChave_virada(boolean Chave_virada) {
        this.Chave_virada = Chave_virada;
    }
    //controle carro
    public void Ligar(){
        Chave_virada=true;
    }
    public void acelerar(int acelerando){
        Velocidade_atual= Velocidade_atual+acelerando;
    }
    public void mudarMarcha(int marcha){
        Marcha_atual=Marcha_atual+marcha;
    }
    public void Parar(){
        Freio_de_mao_Puxado=true;
        Chave_virada=false;
        
    }
    
}
