/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_frequencia_lian;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class PROJETO_FREQUENCIA_LIAN {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Ola aluno!");
        System.out.println("Digite sua primeira nota: ");
            int RespNota1 = ler.nextInt();
        System.out.println("Digite sua segunda nota: ");
            int RespNota2 = ler.nextInt();
        System.out.println("Digite sua terceira nota: ");
            int RespNota3 = ler.nextInt();
        int media = ((RespNota1+RespNota2+RespNota3)/3);
        System.out.println("Sua media e de: "+media);
        System.out.println("Digite sua frequencia: ");
            int RespFreq = ler.nextInt();
        if(RespFreq >= 75){
            if(media >= 7){
                System.out.println("Aprovado! Parabens!");
            }
            else{
                System.out.println("Reprovado! Media inadequada!");
            }
        }
        else{
            System.out.println("Reprovado! Presenca insuficiente");
        }
        
    }
}
