/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inputoutput;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author l.silva
 */
public class InputOutput {

    public static void main(String[] args) throws IOException {
        String s = "";
        float notas[] = new float [4], media = 0;
        DataInputStream dado;
        for(int i = 0; i < 4; i ++){
            System.out.println("Entre com a nota "+(i+1)+": ");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            notas[i] = Float.parseFloat(s);
            media += notas[i];
        }
        media /= 4;
        System.out.println("Media: "+media);
    }
}
