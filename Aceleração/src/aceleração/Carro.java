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
public class Carro implements Veiculo, Turbo{
    double velocidade_maxima = 200;
    double velocidade_atual = 50;
    public void acelerar() {
        if(velocidade_atual < velocidade_maxima);
            System.out.println("Vrummm");
            while(velocidade_atual < velocidade_maxima)
                velocidade_atual += 3;
    }
    public void frear() {
        while(velocidade_atual > 0)
        velocidade_atual--;
    }
    public void acelerarTurbo(){
        if(velocidade_atual < velocidade_maxima);
            System.out.println("Vrummm");
            while(velocidade_atual < velocidade_maxima)
                velocidade_atual += 3*5;
    }
}
