/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetores_4;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class LISTA_VETORES_4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double vet[] = new double [20];
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Digite um numero: ");
            vet[i] = ler.nextDouble() / 2;
        }
        for(int i = 0; i < 10; i++)
        {
            System.out.println(vet[i]);
        }
    }
}
