/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imci;

/**
 *
 * @author Isaac Tabarez
 */
public class Calc {
    double peso;
    double altura;
     private String nombre;
	private int edad;
	private String sexo;
    public Calc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
        
    }
    public double calcular(){
        return getPeso()/(getAltura()*getAltura());
    }
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}