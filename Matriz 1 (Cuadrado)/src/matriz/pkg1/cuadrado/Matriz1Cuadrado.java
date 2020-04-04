/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz.pkg1.cuadrado;

import java.util.Scanner;

/**
 *
 * @author Isaac Tabarez
 */
public class Matriz1Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

		int tamaño = 0;
		System.out.println("Dame tamaño del cuadrado");
		tamaño = teclado.nextInt();

		for(int i = 1; i<= tamaño; i++){

			for(int j = 1; j<=tamaño; j++){
				if( j == 1 || j == tamaño || i == 1 || i == tamaño ){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
				
				
			}
			System.out.println();
		}
    
    }
    }
    

