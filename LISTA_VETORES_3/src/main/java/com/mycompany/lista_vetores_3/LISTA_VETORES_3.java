/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetores_3;

/**
 *
 * @author l.silva
 */
public class LISTA_VETORES_3 {

    public static void main(String[] args) {
        int vet[] = new int [101];
        for(int i = 0; i < 100; i++)
        {
            vet[i] = i+1;
            if((i+1)%2 == 0)
            {
                System.out.println(vet[i]);
            }
        }
    }
}
