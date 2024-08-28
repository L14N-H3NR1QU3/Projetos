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
    static Scanner ler = new Scanner (System.in);
    static String nomeFilme;
    public static void main(String[] args) {
        String[] nome = new String[2];
        String[] dica = new String[5];
        System.out.println("Nome do primeiro jogador: ");
        nome[0] = ler.next();
        player1(nome, dica);
        System.out.println("Nome do segundo jogador: ");
        nome[1] = ler.next();
        player2(nome, dica);
    }
    public static void player1 (String[] nome, String[] dica){
        System.out.println("Digite o nome do filme "+nome[0]+": ");
        nomeFilme = ler.next();
        System.out.println("O nome do filme e: "+nomeFilme);
        for(int i = 0; i < 5; i++){
            System.out.println("Digite a dica "+(i+1)+":");
            dica[i] = ler.next();
        }
    }
    public static void player2 (String[] nome, String[] dica){
        int chance = 5;
        System.out.println("O nome do filme e: "+nomeFilme);
        for(int i = 0; i < 5; i++){
            System.out.println("Sua primeira dica e: "+dica[i]);
            System.out.println("Digite o filme "+nome[1]+": ");
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
