/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testes_lian;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class TESTES_LIAN {

    public static void main(String[] args) {
        int numb = 15;
        double decimal = 1.5;
        boolean teste = true;
            System.out.println("Ola mundo!");
            System.out.print("Ola ");
            System.out.println("mundo!");
            System.out.println(15+20);
            System.out.println(numb+20);
            System.out.println(decimal);
            System.out.println(teste);
        Scanner ler = new Scanner(System.in);
            int resp = ler.nextInt();
            System.out.println("Sua resposta: "+resp);
        for (int i = 0; i < 11; i++){
            System.out.println(i);
        }
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }
    }
}
