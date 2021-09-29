/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import domain.Vehiculo;
/**
 *
 * @author milla
 */
public class PruebaGestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Vehiculo coche1 = new Vehiculo("1456KLÑ", "Opel", "Astra", "Rosa", 2134, true);
        Vehiculo coche2 = new Vehiculo("6789KLÑ", "Nisan", "Astra", "Morada", 2134, true);
        Vehiculo coche3 = new Vehiculo("9345KLÑ", "Honda", "Astra", "Blanco", 2134, true);
        Vehiculo coche4 = new Vehiculo("2378KLÑ", "Toyota", "Astra", "Amarilla", 2134, true);
        Vehiculo coche5 = new Vehiculo("8920KLÑ", "Opel", "Astra", "Negro", 2134, true);
        System.out.println("coche1 = " + coche1);
    }
    
}
