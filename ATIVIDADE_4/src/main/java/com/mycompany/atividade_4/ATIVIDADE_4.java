/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_4;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author l.silva
 */
public class ATIVIDADE_4 {

    public static void main(String[] args) throws IOException {
        int num[] = new int [8];
        int neg = 0;
        DataInputStream dado;
        for(int i = 0; i < 8; i++){
            System.out.println("Digite um numero: ");
            dado = new DataInputStream(System.in);
            String res = dado.readLine();
            try{
                num[i] = Integer.parseInt(res);
                if(num[i] < 0){
                    neg++;
                }
            }
            catch(NumberFormatException e){
                System.out.println("Erro: Argumento invalido.");
                i--;
            }
        }
        System.out.println("Quantidade de numeros negativos: "+neg);
    }
}
