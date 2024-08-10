/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_9_lian;

/**
 *
 * @author Ryzen
 */
public class PROJETO_9_LIAN {

    public static void main(String[] args) {
        int aux = 0;
        for(int i = 0; i < 600; i++){
            if(aux == 80){
                aux = 0;
            }
            else if(aux <= 30){
                System.out.println("Verde");
            }
            else if((aux > 30) && (aux <= 35)){
                System.out.println("Amarelo");
            }
            else{
                System.out.println("Vermelho");
            }
            aux++;
        }
    }
}
