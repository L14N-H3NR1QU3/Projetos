/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetores_7;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class LISTA_VETORES_7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        String nomes[] = new String [10];
        int auxEnc = 0;
        for(int i = 0; i < 10; i ++){
            System.out.print("Digite um nome: ");
            nomes[i] = ler.next();
        }
        System.out.println("Digite um nome a ser encontrado: ");
        String aux = ler.next();
        for(int i = 0; i < 10; i++){
            if(aux.equals(nomes[i])){
                auxEnc++;
            }
        }
        if(auxEnc > 0){
            System.out.println("ACHEI!");
        }
        else{
            System.out.println("NAO ACHEI!");
        }
    }
}
