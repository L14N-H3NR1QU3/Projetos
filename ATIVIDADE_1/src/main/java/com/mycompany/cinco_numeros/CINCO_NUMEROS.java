/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cinco_numeros;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author l.silva
 */
public class CINCO_NUMEROS {

    public static void main(String[] args) throws IOException {
        int num[] = new int [5];
        DataInputStream dado;
        for(int i = 0; i < 5; i++){
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
        }
        for(int i = 0; i < 5; i++){
            if(num[i]%2 == 0){
                System.out.println("Numero par: "+num[i]);
            }
        }
    }
}
