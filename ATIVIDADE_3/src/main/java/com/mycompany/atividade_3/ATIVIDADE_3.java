/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_3;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author l.silva
 */
public class ATIVIDADE_3 {

    public static void main(String[] args) throws IOException {
        int num[] = new int [7];
        int numeros = 0;
        DataInputStream dado;
        for(int i = 0; i < 7; i++){
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
            if(num[i]%3 == 0){
                numeros += num[i];
            }
        }
        System.out.println("Resultado: "+(numeros/7));
        
    }
}
