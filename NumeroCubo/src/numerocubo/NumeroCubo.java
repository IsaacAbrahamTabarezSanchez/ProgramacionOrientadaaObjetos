/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerocubo;

import java.util.Scanner;

/**
 *
 * @author Isaac Tabarez
 */
public class NumeroCubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner teclado=new Scanner(System.in);
        double a;
        int e;
        System.out.println("INGRESE UN NUMERO QUE DESEE SABER SI ES CUBICO O NO");
        a=teclado.nextDouble();
        double raiz=Math.cbrt(a);
        System.out.println("LA RAIZ CUBICA DEL NUMERO ES: "+raiz);
        if(raiz%1==0){
            System.out.println("EL NUMERO ES CUBICO");
        }else{
            System.out.println("EL NUMERO NO ES CUBICO");
        }
        
        
    }
    
}
    
    

