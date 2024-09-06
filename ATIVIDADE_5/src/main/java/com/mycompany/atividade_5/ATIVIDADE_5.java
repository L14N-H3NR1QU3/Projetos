/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_5;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author l.silva
 */
public class ATIVIDADE_5 {

    public static void main(String[] args) throws IOException {
        int num[] = new int [10];
        float media = 0;
        DataInputStream dado;
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um numero: ");
            dado = new DataInputStream (System.in);
            String res = dado.readLine();
            try{
                num[i] = Integer.parseInt(res);
                media += num[i];
            }
            catch(NumberFormatException e){
                System.out.println("Erro: Argumento invalido.");
                i--;
            }
        }
        media /= 10;
        System.out.println("Media: "+media);
        for(int i = 0; i < 10; i++){
            if(num[i] >= media){
                System.out.println("Valor acima da media: "+num[i]);
            }
        }
    }
}
