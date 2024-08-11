/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_9_lian;

/**
 *
 * @author Ryzen
 */
import java.util.Random;
public class PROJETO_9_LIAN {
    public static void main(String[] args) {
        Random rand = new Random();
        int carros = rand.nextInt(10);
        int totalCarros1 = carros;
        int totalCarros2 = 0;
        int totalCarros3 = 0;
        int novosCarros = 0;
        int tempo = 0;
        for(int i = 1; i <= 3; i++){
            /*as 3 vias*/
            for(int j = 0; j < 200; j++){
                System.out.println(j+" ");
                if(tempo == 80){
                    /*tempo em que ocorre o ciclo do semaforo*/
                    tempo = 0;
                }
                if(novosCarros == 15){
                    /*tampo com que ocorre a entrada de carros*/
                    novosCarros = 0;
                    if(carros < 10){
                        carros += rand.nextInt(10);
                        if(i == 1){
                            totalCarros1 += carros;
                        }
                        else if(i == 2){
                            totalCarros2 += carros;
                        }
                        else{
                            totalCarros3 += carros;
                        }
                    }
                }
                else if(tempo <= 30){
                    System.out.println("Verde no sinal "+i);
                    while(carros > 0){
                        /*saida de carros*/
                        System.out.println("Carro sai no sinal "+i);
                        carros--;
                        tempo++;
                        j++;
                    }
                }
                else if((tempo > 30) && (tempo <= 35)){
                    System.out.println("Amarelo no sinal "+i);
                }
                else{
                    System.out.println("Vermelho no sinal "+i);
                }
                novosCarros++;
                tempo++;
            }
        }
        System.out.println("Sairam "+totalCarros1+" carros da primeira intersecao");
        System.out.println("Sairam "+totalCarros2+" carros da segunda intersecao");
        System.out.println("Sairam "+totalCarros3+" carros da terceira intersecao");
    }
}