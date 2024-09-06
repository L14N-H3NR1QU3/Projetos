/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author l.silva
 */
public class ATIVIDADE_2 {

    public static void main(String[] args) throws IOException {
        int num[] = new int [10];
        int impar = 0;
        DataInputStream dado;
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um numero: ");
            dado = new DataInputStream(System.in);
            String res = dado.readLine();
            try{
                num[i] = Integer.parseInt(res);
            }
            catch(NumberFormatException e){
                System.out.println("Erro: Argumento invalido.");
                i--;
            }
            if(num[i]%2 != 0){
                impar += num[i];
            }
        }
        System.out.println("Soma numero impar: "+impar);
    }
}
