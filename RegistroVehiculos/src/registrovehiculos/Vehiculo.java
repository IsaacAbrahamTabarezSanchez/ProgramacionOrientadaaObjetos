/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrovehiculos;

/**
 *
 * @author Isaac Tabarez
 */
public class Vehiculo {
    String medio, pasaje,puertas,llantas, velocidad,vehiculo;

    public Vehiculo(String medio, String pasaje, String puertas, String llantas, String velocidad,String vehiculo) {
        this.medio = medio;
        this.pasaje = pasaje;
        this.puertas = puertas;
        this.llantas = llantas;
        this.velocidad = velocidad;
        this.vehiculo=vehiculo;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }


    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public String getPasaje() {
        return pasaje;
    }

    public void setPasaje(String pasaje) {
        this.pasaje = pasaje;
    }

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
    
   

}








