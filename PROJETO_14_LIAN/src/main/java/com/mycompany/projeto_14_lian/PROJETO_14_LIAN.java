/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projeto_14_lian;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author l.silva
 */
public class PROJETO_14_LIAN {

    public static void main(String[] args) throws IOException {
        int n = 3;
        int num[][] = new int[n][n];
        int repNum = 0;
        int auxNum = 0;
        DataInputStream dado;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Digite um numero: ");
                dado = new DataInputStream(System.in);
                String res = dado.readLine();
                try {
                    num[i][j] = Integer.parseInt(res);
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Argumento invalido.");
                    j--;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + num[i][j] + "]");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        if (num[i][j] <= num[k][l]) {
                            int aux = num[i][j];
                            num[i][j] = num[k][l];
                            num[k][l] = aux;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + num[i][j] + "]");
            }
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            int cal = 0;
            for (int j = 0; j < n; j++) {
                cal += num[i][j];
            }
            System.out.println("Calculo da linha " + i + ": " + cal);
        }
        System.out.println("\n");
        
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = i; k < n; k++) {
                    for (int l = j + 1; l < n; l++) {
                        if (num[i][j] == num[k][l]) {
                            int aux = auxNum;
                            auxNum = num[i][j];
                            if(auxNum != aux){
                                repNum = 0;
                            }
                            else{
                                repNum++;
                            }
                        }
                    }
                }
            }
            if(repNum != 0){
                System.out.println("O numero repetido e: " + auxNum + " repetindo: " + (repNum+1) + " vezes.");
            }
        }*/
        
        int somatorio = 0;
        for(int i = 0; i < n; i++){
            somatorio += num[i][i];
        }
        System.out.println("Somatorio da diagonal principal: "+somatorio);
        somatorio = 0;
        for(int i = 0; i < n; i++){
            somatorio += num[i][n - (i+1)];
        }
        System.out.println("Somatorio da diagonal segundario: "+somatorio);
    }
}
