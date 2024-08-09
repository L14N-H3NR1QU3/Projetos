/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_8_lian;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class PROJETO_8_LIAN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Ola usuario!");
        System.out.println("Digite a quantidade de medalhas de bronze: ");
            int bronze = ler.nextInt();
        System.out.println("Digite a quantidade de medalhas de prata: ");
            int prata = ler.nextInt();
        System.out.println("Digite a quantidade de medalhas de outro: ");
            int ouro = ler.nextInt();
        System.out.println("Medalhas de ouro: "+ouro);
        System.out.println("Medalhas de prata: "+prata);
        System.out.println("Medalhas de bronze: "+bronze);
        int total = ouro+prata+bronze;
        System.out.println("Total de medalhas: "+total);
        if((ouro > 5) && (total >= 30)){
            System.out.println("Desempenho Extraordinario!");
        }
        else if(ouro >= 10){
            System.out.println("Otimo desenpenho!");
        }
        else if((ouro < 10) && (ouro > 5)){
            System.out.println("Bom desempenho!");
        }
        else if((ouro < 5) && (total > 20)){
            System.out.println("Desempenho regular!");
        }
        else if(total <= 20){
            System.out.println("Desempenho fraco!");
        }
    }
}
