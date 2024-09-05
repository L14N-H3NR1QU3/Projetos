/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetores_10;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;
public class LISTA_VETORES_10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int Q[] = new int [20];
        int maior = 0;
        int menor = 0;
        for(int i = 0; i < 20; i++){
            System.out.print("Digite numeros positivos: ");
            Q[i] = ler.nextInt();
            if(Q[i] < 0){
                Q[i] = 0;
                System.out.println("Erro: numero invalido.");
                i--;
            }
            if(maior < Q[i]){
                maior = Q[i];
            }
            if(menor == 0){
                menor = Q[i];
            }
            else if(menor > Q[i]){
                menor = Q[i];
            }
        }
        System.out.println("Maior numero: "+maior);
        System.out.println("Menor numero: "+menor);
    }
}