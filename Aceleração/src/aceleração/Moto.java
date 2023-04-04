/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceleração;

/**
 *
 * @author vitor
 */
public class Moto implements Veiculo {
    double velocidade_maxima = 150;
    double velocidade_atual = 70;
    public void acelerar() {
        if(velocidade_atual < velocidade_maxima);
        System.out.println("Ran dan dan dan");
        while(velocidade_atual < velocidade_maxima)
        velocidade_atual += 2;
    }
    public void frear() {
        while(velocidade_atual > 0)
        velocidade_atual--;
    }
    public void acelerarTurbo(){
        if(velocidade_atual < velocidade_maxima);
            System.out.println("Ran dan dan dan");
        while(velocidade_atual < velocidade_maxima)
            velocidade_atual += 2*3;
    }
}