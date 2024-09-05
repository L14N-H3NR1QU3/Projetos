/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetores_6;

/**
 *
 * @author l.silva
 */
public class LISTA_VETORES_6 {

    public static void main(String[] args) {
        int V[] = {5, 1, 4, 2, 7, 8, 3, 6};
        int aux;
        for(int i = 8; i <= 5; i--){
            aux = V[i];
            V[i] = V[8-i+1];
            V[8-i+1] = aux;
        }
        V[3] = V[1];
        V[V[3]] = V[V[2]];
        for(int i = 0; i < 8; i++){
            System.out.println("Valor: "+V[i]+" Indice: "+i);
        }
    }
}
