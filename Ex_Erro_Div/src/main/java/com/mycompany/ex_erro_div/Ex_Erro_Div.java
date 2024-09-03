/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_erro_div;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class Ex_Erro_Div {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        float vet[] = new float [4];
        for(int i = 0; i < 4; i++){
            System.out.print("Digite um numero: ");
            String res = ler.next();
            try{
                float num = Integer.parseInt(res);
                vet[i] = num;
            }
            catch (NumberFormatException e2){
                System.out.println("Erro: argumento invalido.");
                break;
            }
        }
        try{
            double res1 = vet[0]/vet[1];
            System.out.println("Resultado 1: "+res1);
        }
        catch (ArithmeticException e){
            System.out.println("Erro: calculo invalido");
        }
        try{
            double res2 = vet[2]/vet[3];
            System.out.println("Resultado 2: "+res2);
        }
        catch (ArithmeticException e){
            System.out.println("Erro: calculo invalido.");
        }
        ler.close();
    }
}
