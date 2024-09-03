/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_erro_divizao;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class Ex_Erro_Divizao {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.print("Digite um numero: ");
        int num = ler.nextInt();
        System.out.print("Digite um divisor: ");
        int div = ler.nextInt();
        
        try{
            float res = num/div;
            System.out.println("Resultado: " + res);
        }
        catch (ArithmeticException e){
            System.out.println("Erro: Divisao zero.");
        }
        ler.close();
    }
}
