/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author milla
 */
public class Vehiculo extends Object{
    private String matricula;
    private String marca;
    private String modelo; 
    private String color;
    private double tarifa;
    private boolean disponible;
    private static  int contadorVehiculos;
    private static int vehiculoID;
    //------------------------------------------------

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    //-------------------------------------
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    //-----------------------------------------

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }

    public static int getVehiculoID() {
        return vehiculoID;
    }
    
    //-----------------------------------------

    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }
    
    public Vehiculo(){
        this.vehiculoID = ++Vehiculo.contadorVehiculos;
    }
    
}
