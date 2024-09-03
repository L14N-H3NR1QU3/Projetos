/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_aula_erro;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class Ex_aula_Erro {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.print("Digite um numero: ");
        String valorString = ler.next();
        try
        {
            float valorFloat = Integer.parseInt(valorString);
            System.out.println("Valor decimal: "+valorFloat);
        } catch (NumberFormatException erro)
        {
            System.out.println("Erro: " + erro.getMessage());
        }
    }
}
