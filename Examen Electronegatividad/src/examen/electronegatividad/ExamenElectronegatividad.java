/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.electronegatividad;

import java.util.Scanner;

/**
 *
 * Tabarez Sanchez Isaac Abraham
 * Grupo;2S11
 */
public class ExamenElectronegatividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Tabarez Sánchez Isaac Abraham Grupo;2S11");
        Scanner leer = new Scanner(System.in);
     double a,b,c;
     String [] elementos =new String [69];
       
       
       elementos[0]="H  (2.20)";
       elementos[1]="Li (0.98)";
       elementos[2]="Be (1.57)";
       elementos[3]="B  (2.04)";
       elementos[4]="C  (2.55)";
       elementos[5]="N  (3.04)";
       elementos[6]="O  (3.44)";
       elementos[7]="F  (3.98)";
       elementos[8]="Na (0.93)";
       elementos[9]="Mg (1.31)";
       elementos[10]="Al (1.61)";
       elementos[11]="Si (1.90)";
       elementos[12]="P  (2.19)";
       elementos[13]="S  (2.58)";
       elementos[14]="Cl (3.16)";
       elementos[15]="k  (0.82)";
       elementos[16]="Ca (1.00)";
       elementos[17]="Sc (1.36)";
       elementos[18]="Ti (1.54)";
       elementos[19]="V  (1.63)";
       elementos[20]="Cr (1.66)";
       elementos[21]="Mn (1.55)";
       elementos[22]="Fe (1.83)";
       elementos[23]="Co (1.88)";
       elementos[24]="Ni (1.91)";
       elementos[25]="Cu (1.90)";
       elementos[26]="Zn (1.65)";
       elementos[27]="Ga (1.81)";
       elementos[28]="Ge (2.01)";
       elementos[29]="As (2.18)";
       elementos[30]="Se (2.55)";
       elementos[31]="Br (2.96)";
       elementos[32]="Rb (0.82)";
       elementos[33]="Sr (0.95)";
       elementos[34]="Y  (1.22)";
       elementos[35]="Zr (1.33)";
       elementos[36]="Nb (1.6)";
       elementos[37]="Mo (2.16)";
       elementos[38]="Tc (2.10)";
       elementos[39]="Ru (2.2)";
       elementos[40]="Rh (2.28)";
       elementos[41]="Pd (2.20)";
       elementos[42]="Ag (1.93)";
       elementos[43]="Cd (1.69)";
       elementos[44]="In (1.78)";
       elementos[45]="Sn (1.96)";
       elementos[46]="Sb (2.05)";
       elementos[47]="Te (2.1)";
       elementos[48]="I  (2.66)";
       elementos[49]="Cs (0.79)";
       elementos[50]="Ba (0.89)";
       elementos[51]="La (1.10)";               
       elementos[52]="Hf (1.39)";
       elementos[53]="Ta (1.5)";
       elementos[54]="W  (1,7)";
       elementos[55]="Re (1.9)";
       elementos[56]="Os (2.2)";
       elementos[57]="Ir (2.2)";
       elementos[58]="Pt (2.2)";
       elementos[59]="Au (2.4)";
       elementos[60]="Hg (1.9)";
       elementos[61]="Ti (1.89";
       elementos[62]="Pb (1.8)";
       elementos[63]="Bi (1.9)";
       elementos[64]="Po (2.0)";
       elementos[65]="At (2.2)";
       elementos[66]="Fr (0.7)";
       elementos[67]="Ra (0.9)";
       elementos[68]="Ac (1.1)";
     for ( int i=0; i < elementos.length ;i++){
         System.out.println("Elemento:..."+elementos[i]);
     }
        System.out.println("Ingrese el elemento con mayor electronegatividad");
        a=leer.nextDouble();
        System.out.println("Ingresa el elemento con menor electronegatividad");
        b=leer.nextDouble();
        c=a-b;
        if ((c<=0.4)&&!((a==0)|| (b==0))){
            System.out.println("Tenemos un enlace covalente no polar o apolar");
            System.out.println("Por que tiene una diferencia de elctronegatividad igual a:"+c);
            System.out.println("Esta dentro del rango de Menor o igual  0.4 (<=0.4)");
        }
        if (((c>0.4)  && (c<=1.7))&&!((a==0)|| (b==0))){
            System.out.println("Es un enlace covalente polar");
            System.out.println("Por que tiene una diferencia de elctronegatividad igual a:"+c);
             System.out.println("Esta dentro del rango de Mayor a 0.4 y menor o igual a 1.7 (>0.4 y <=1.7)");
    }  
        if ((c>1.7)&&!((a==0)|| (b==0))){
            System.out.println("Tenemos un enlace ionico");
            System.out.println("Por que tienen una diferencia de elctronegatividad igual a:"+c);
              System.out.println("Esta dentro del rango de Mayor a 1.7(>1.7)");
    }  
        if ((a==0)|| (b==0)){
            System.out.println("No existe enlace ");
            System.out.println("Porque  existe un gas noble en el compuesto");
    }  
   
    }
}
