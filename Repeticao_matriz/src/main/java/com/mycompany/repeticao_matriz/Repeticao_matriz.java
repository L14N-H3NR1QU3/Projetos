/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repeticao_matriz;

/**
 *
 * @author l.silva
 */
public class Repeticao_matriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 2, 6},
            {7, 8, 1}
        };

        encontrarRepeticoes(matriz);
    }

    public static void encontrarRepeticoes(int[][] matriz) {
        // Encontrar o número total de elementos
        int totalElements = 9;

        // Criar arrays para armazenar os elementos e suas contagens
        int[] elementos = new int[totalElements];
        int[] contagens = new int[totalElements];
        int numElementos = 0;

        // Preencher os arrays com os elementos da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(numElementos);
                int elementoAtual = matriz[i][j];
                boolean encontrado = false;

                // Verificar se o elemento já está no array
                for (int k = 0; k < numElementos; k++) {
                    if (elementos[k] == elementoAtual) {
                        contagens[k]++;
                        encontrado = true;
                        break;
                    }
                }

                // Se o elemento não foi encontrado, adicionar ao array
                if (!encontrado) {
                    elementos[numElementos] = elementoAtual;
                    contagens[numElementos] = 1;
                    numElementos++;
                }
            }
        }

        // Imprimir os elementos que foram repetidos
        System.out.println("Elementos repetidos:");
        for (int i = 0; i < numElementos; i++) {
            if (contagens[i] > 1) {
                System.out.println("Elemento: " + elementos[i] + ", Contagem: " + contagens[i]);
            }
        }
    }
}