/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetores_8;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class LISTA_VETORES_8 {

    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        double notas[] = new double [20];
        double media = 0;
        int acimaMedia = 0;
        for(int i = 0; i < 20; i++){
            if(i < 9){
                System.out.print("Digite a nota do aluno 0"+(i+1)+": ");
            }
            else{
                System.out.print("Digite a nota do aluno "+(i+1)+": ");
            }
            notas[i] = ler.nextDouble();
            media += notas[i];
            if(notas[i] >= 6){
                acimaMedia++;
            }
        }
        media /= 20;
        System.out.println("Media da turma: "+media);
        System.out.println("Alunos acima da media: "+acimaMedia);
    }
}
