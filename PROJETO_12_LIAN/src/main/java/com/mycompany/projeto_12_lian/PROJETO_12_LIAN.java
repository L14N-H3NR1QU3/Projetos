/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_lian;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class PROJETO_12_LIAN {
    static String nomeFilme;
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        String[] nome = new String[2];
        String[] dica = new String[5];
        System.out.print("Nome do primeiro jogador: ");
        nome[0] = ler.next();
        player1(nome, dica);
        System.out.print("Nome do segundo jogador: ");
        nome[1] = ler.next();
        player2(nome, dica);
    }
    public static void player1 (String[] nome, String[] dica){
        Scanner ler = new Scanner (System.in);
        System.out.print("Digite o nome do filme "+nome[0]+": ");
        nomeFilme = ler.next();
        for(int i = 0; i < 5; i++){
            System.out.println("Digite a dica "+(i+1)+":");
            dica[i] = ler.next();
        }
    }
    public static void player2 (String[] nome, String[] dica){
        Scanner ler = new Scanner (System.in);
        int chance = 5;
        for(int i = 0; i < 5; i++){
            System.out.println("Sua dica e: "+dica[i]);
<<<<<<< HEAD
            System.out.print("Digite o filme "+nome[1]+": ");
=======
            System.out.println("Digite o filme "+nome[1]+": ");
>>>>>>> 3a1b46298b7926a8f2e9ec33e9f3129f6129ee13
            String resp = ler.next();
            if(resp.equals(nomeFilme)){
                System.out.println("Acertou o filme e "+resp+"! Parabens!");
                break;
            }
            else{
                System.out.println("Errou tente novamente!");
                chance--;
            }
        }
        if(chance == 0){
            System.out.print("Voce perdeu");
        }
    }
}
