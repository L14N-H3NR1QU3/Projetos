/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_7_lian;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class PROJETO_7_LIAN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Ola usuario!");
        System.out.println("Digite seu peso(Kg): ");
            double peso = ler.nextDouble();
        System.out.println("Digite sua altura(M): ");
            double altura = ler.nextDouble();
        double IMC = peso/(altura*altura);
        System.out.println("Seu IMC deu: "+IMC);
        if(IMC < 18.5){
            System.out.println("Abaixo do peso ideal!");
        }
        else if((IMC > 18.5) && (IMC < 24.9)){
            System.out.println("Peso ideal!");
        }
        else if((IMC > 24.9) && (IMC < 34.9)){
            System.out.println("Excesso de peso!");
        }
        else if((IMC > 34.9) && (IMC < 39.9)){
            System.out.println("Obesidade classe 1!");
        }
        else if(IMC > 40){
            System.out.println("Obesidade classe 2!");
        }
    }
}
