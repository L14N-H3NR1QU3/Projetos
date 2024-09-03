/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_de_sala_lian;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class Exercicio_de_sala_Lian {
    static Scanner ler = new Scanner (System.in);
    public static void main(String[] args) {
        String[] nomes = new String [10];
        coletaNomes(nomes);
        mostraNomes(nomes);
    }
    public static void coletaNomes(String[] nomes){
        for(int i = 0; i < 10; i++){
            System.out.print("Digite um nome: ");
            nomes[i] = ler.next();
        }
    }
    public static void mostraNomes(String[] nomes){
        for(int i = 0; i < 10; i++){
            if(i < 9){
                System.out.println("Nome 0"+(i+1)+": "+nomes[i]);
            }else{
                System.out.println("Nome "+(i+1)+": "+nomes[i]);
            }
        }
    }
}
