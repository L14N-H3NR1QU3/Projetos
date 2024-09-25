/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projeto_lian_13;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;

public class PROJETO_LIAN_13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String res;
        int tam = 0;
        int op = 0;
        int ind1 = 0;
        int ind2 = 0;

        do {
            System.out.print("Digite o tamanho do vetor: ");
            res = ler.next();
            try {
                tam = Integer.parseInt(res);
                if (tam <= 0) {
                    System.out.println("Erro: tamanho do vetor invalido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: argumento invalido");
            }
        } while (tam <= 0);

        int vet[] = new int[tam];
        double resultados[] = new double[tam];

        for (int i = 0; i < tam; i++) {
            do {
                System.out.print("Digite um numero: ");
                res = ler.next();
                try {
                    vet[i] = Integer.parseInt(res);
                } catch (NumberFormatException e) {
                    System.out.println("Erro: argumento invalido.");
                }
            } while (vet[i] == 0 && !res.equals("0"));
            if (vet[i] < 0) {
                System.out.println("Erro: argumento invalido.");
                i--;
            }
        }

        for (int i = 0; i < tam; i++) {
            System.out.println("Numero: " + vet[i] + " Indice: " + i);
        }

        for (int i = 0; i < tam; i++) {

            do {
                System.out.println("Escolha: \n 1 - Soma \n 2 - Subtracao \n 3 - Multiplicacao \n 4 - Divisao");
                res = ler.next();
                try {
                    op = Integer.parseInt(res);
                    if (op > 4 || op < 0) {
                        System.out.println("Erro: operacao invelida.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro: argumento invalido.");
                }
            } while (op > 4 || op <= 0);

            do {
                System.out.println("Escolha o primeiro indice: ");
                res = ler.next();
                try {
                    ind1 = Integer.parseInt(res);
                    if (ind1 >= tam || ind1 < 0) {
                        System.out.println("Erro: primeiro indice invalido.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro: primeiro indice invalido.");
                }
            } while (ind1 < 0 || ind1 >= tam || ind1 == 0 && !res.equals("0"));

            do {
                System.out.println("Escolha o segundo indice: ");
                res = ler.next();
                try {
                    ind2 = Integer.parseInt(res);
                    if (ind2 >= tam || ind2 < 0) {
                        System.out.println("Erro: segundo indice invalido.");
                    }
                } catch (NumberFormatException e2) {
                    System.out.println("Erro: segundo indice invalido.");
                }
            } while (ind2 < 0 || ind2 >= tam || ind2 == 0 && !res.equals("0"));

            switch (op) {
                case 1:
                    resultados[i] = vet[ind1] + vet[ind2];
                    System.out.println("Resultado " + (i + 1) + ": " + resultados[i]);
                    break;
                case 2:
                    resultados[i] = vet[ind1] - vet[ind2];
                    System.out.println("Resultado " + (i + 1) + ": " + resultados[i]);
                    break;
                case 3:
                    resultados[i] = vet[ind1] * vet[ind2];
                    System.out.println("Resultado " + (i + 1) + ": " + resultados[i]);
                    break;
                case 4:
                    try {
                        double num1 = vet[ind1], num2 = vet[ind2];
                        resultados[i] = num1 / num2;
                        System.out.println("Resultado " + (i + 1) + ": " + resultados[i]);
                    } catch (ArithmeticException e) {
                        System.out.println("Erro: calculo indisponivael");
                        i--;
                    }
                    break;
            }

        }
        System.out.println("\nResultados dos calculos:");
        for (int i = 0; i < tam; i++) {
            System.out.println("Resultado "+(i+1)+":"+resultados[i]);
        }
    }
}
