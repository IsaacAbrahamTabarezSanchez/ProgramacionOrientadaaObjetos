/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercambiarfilasycolumnas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Isaac Tabarez
 */
public class IntercambiarFilasyColumnas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner Teclado=new Scanner (System.in);
       int a,b,c;
        Random R=new Random();
        System.out.println("Cuantas filas tendra la matriz");
        a=Teclado.nextInt();
        System.out.println("Cuantas columnas tendra la matriz");
        b=Teclado.nextInt();
        System.out.println("Mostrara numeros del 1 al...");
        c=Teclado.nextInt();
        
        int Matriz[][]= new int[a][b];
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                Matriz[i][j] = R.nextInt(c)+1;
              
            }
        }
        System.out.println("MATRIZ ORIGINAL");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
        System.out.print(Matriz[i][j]+"\t");
    }
            System.out.println("\n");        
        }
   System.out.println("MATRIZ TRASPUESTA");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
        System.out.print(Matriz[j][i]+"\t");
    }
            System.out.println("\n");  
    }
    
}}
    
    

