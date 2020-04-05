/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenarray;

import java.util.Scanner;

/**
 *
 * @author Isaac Tabarez
 */
public class OrdenArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner Teclado = new Scanner(System.in);
      
int n,num,i,j;

System.out.print("Ingrese cantidad de números: ");
n = Teclado.nextInt();

int[] numeros = new int[n + 1];
for(i = 1; i <= n; i++)
    
{
 System.out.print("Ingreseumero (" + i + ") : ");
 numeros[i] = Teclado.nextInt();
}

for(i = 1; i <= n; i++)
    
{
for(j = i; j <= n; j++)
{
if(numeros[i] < numeros[j])
{
num = numeros[i];
numeros[i] = numeros[j];
numeros[j] = num;
}
}
}

System.out.println("\n Los numeros de mayor a menor son:");
for(i = 1; i <= n; i++)
    
{
System.out.println(numeros[i]);
}
}
} 
    
    

