/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_tabuada_lian;

/**
 *
 * @author l.silva
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;
public class PROJETO_TABUADA_LIAN {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        boolean correto = true;
        Date tempo = new Date();
        String valor;
        int numero = 0;
        System.out.println("-------------------Tabuada------------------");
        System.out.println("Digite o nome do arquivo:");
        String nomeArquivo = sc.next();
        FileWriter arquivo = new FileWriter ("C:/Users/l.silva/Desktop/Atividade_Tabuada/"+nomeArquivo+".txt");
        do{
            System.out.println("--------------------------------------------");
            System.out.println("Digite um numero para taboada:");
            valor = sc.next();
            System.out.println("--------------------------------------------");
            try{
                numero = Integer.parseInt(valor);
            }
            catch(NumberFormatException e){
                System.out.println("Erro: valor invalida!");
                correto = false;
            }
        }while(!correto);
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.printf("--------------------------------------------\n");
        gravar.printf("Tabuada do "+valor+" | "+tempo+"\n");
        gravar.printf("--------------------------------------------\n");
        for(int i = 1; i <= 10; i++){
            gravar.printf(i+" * "+valor+" = "+(i*numero)+"\n");
        }
        gravar.printf("--------------------------------------------\n");
        arquivo.close();
    }
}
