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
        Scanner ler = new Scanner (System.in);
        System.out.print("Digite o tamanho do vetor: ");
        String res = ler.next();
        int tam = 0;
        int op = 0;
        int ind1 = 0;
        int ind2 = 0;
        try{
            tam = Integer.parseInt(res);
        }
        catch(NumberFormatException e){
            System.out.println("Erro: tamanho do vetor invalido");
        }
        int vet[] = new int [tam];
        int resultados[] = new int [tam];
        for(int i = 0; i < tam; i++){
            System.out.print("Digite um numero: ");
            res = ler.next();
            try{
                vet[i] = Integer.parseInt(res);
            }
            catch(NumberFormatException e){
                System.out.println("Erro: Argumento invalido.");
                break;
            }
        }
        for(int i = 0; i < tam; i++){
            if(vet[i] != 0){
                System.out.println("Numero: "+vet[i]+" Indice: "+i);
            }
            else{
                System.out.println("Erro!");
            }
        }
        for(int i = 0; i < tam; i++){
            System.out.println("Escolha: \n 1 - Soma \n 2 - Subtracao \n 3 - Multiplicacao \n 4 - Divisao");
            res = ler.next();
            try{
                op = Integer.parseInt(res);
            }
            catch(NumberFormatException e){
                System.out.println("Erro: Escolha invalida.");
                i--;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Erro: idice invalido");
                i--;
            }
            System.out.println("Escolha o primeiro indice: ");
            res = ler.next();
            try{
                ind1 = Integer.parseInt(res);
            }
            catch(NumberFormatException e){
                System.out.println("Erro: Primeiro indice invalido.");
                i--;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Erro: idice invalido");
                i--;
            }
            System.out.println("Escolha o primeiro indice: ");
            res = ler.next();
            try{
                ind2 = Integer.parseInt(res);
            }
            catch(NumberFormatException e2){
                System.out.println("Erro: Primeiro segundo invalido.");
                i--;
            }
            switch(op){
                case 1:
                        resultados[i] = vet[ind1] + vet[ind2];
                        System.out.println("Resultado: "+resultados[i]);
                    break;
                case 2:
                        resultados[i] = vet[ind1] - vet[ind2];
                        System.out.println("Resultado: "+resultados[i]);
                    break;
                case 3:
                        resultados[i] = vet[ind1] * vet[ind2];
                        System.out.println("Resultado: "+resultados[i]);
                    break;
                case 4:
                    try{
                        resultados[i] = vet[ind1] / vet[ind2];
                        System.out.println("Resultado: "+resultados[i]);
                    }
                    catch(ArithmeticException e){
                        System.out.println("Erro: calculo indisponivael");
                        i--;
                    }
                    break;
                default:
                        System.out.println("Erro: operador invalido.");
                        i--;
                    break;
            }
        }
        for(int i = 0; i < tam; i++){
            System.out.println("Resultado: "+resultados[i]+" Indice: "+i);
        }
    }
}
