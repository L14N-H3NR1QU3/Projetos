/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_10_lian;

/**
 *
 * @author Ryzen
 */
import java.util.Random;
public class PROJETO_10_LIAN {

    public static void main(String[] args) {
        Random rand = new Random();
        int func;
        int tarefa = 20;
        int prazo = 0;
        for(int i = 1; i <= 5; i++){
            if(tarefa > 0){
                func = rand.nextInt(3)+3;
                tarefa -= func;
                if(i == 5){
                   func += tarefa;
                   tarefa = 0;
                }
                System.out.println(func);
                for(int j = 1; j <= func; j++){
                    prazo += (rand.nextInt(10)+1)*24;
                }
                System.out.println(prazo+" Hrs");
                prazo = 0;
            }
        }
    }
}
