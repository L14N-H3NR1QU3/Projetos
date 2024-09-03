/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_erro_array;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class Ex_Erro_Array {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int vet[] = {10, 20, 30, 40, 50};
        System.out.print("Digite um indece de (0 - 4): ");
        String ind = ler.next();
        try{
            int indice = Integer.parseInt(ind);
            System.out.println("Valor no indice "+ind+" e "+vet[indice]);
        }
        catch (ArrayIndexOutOfBoundsException e1){
            System.out.print("Erro: Indice invalido.");
        }
        catch (NumberFormatException e2){
            System.out.print("Erro: Argumento invalido.");
        }
    }
}
