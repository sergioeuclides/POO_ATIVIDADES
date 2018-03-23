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
public class Carro {
    
    protected String Marca;
    protected String Cor;
    protected String Placa;
    protected int Velocidade_atual;
    protected int Marcha_atual;
    protected boolean Freio_de_mao_Puxado;
    protected boolean Chave_virada;
    
    //contrutor padrao
    public Carro(){
    this.Marca="SEM MARCA";
    this.Cor="SEM COR";
    this.Placa="SEM PLACA";
    this.Velocidade_atual=0;
    this.Marcha_atual=0;
    this.Freio_de_mao_Puxado=true;
    this.Chave_virada=true;
    
    }
    //contrutor completo
    public Carro(String Marca, String Cor, String Placa, int Velocidade_atual, 
            int Marcha_atual, boolean Freio_de_mao_Puxado, boolean Chave_virada){
    this.Marca="Ford";
    this.Cor="Preto";
    this.Placa="ABC 1234";
    this.Velocidade_atual=50;
    this.Marcha_atual=1;
    this.Freio_de_mao_Puxado=false;
    this.Chave_virada=true;
    
        
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
    
    public void Ligar(){
        int Acelerar_ate=+getVelocidade_atual()+50;
        int Mudar_marcha=+getMarcha_atual()+1;
        setVelocidade_atual(Acelerar_ate);
        setMarcha_atual(Mudar_marcha);
    }
    public void Parar(){
        setFreio_de_mao_Puxado(true);
        setChave_virada(false);
        setVelocidade_atual(0);
        setMarcha_atual(0);
        
    }
    
}
