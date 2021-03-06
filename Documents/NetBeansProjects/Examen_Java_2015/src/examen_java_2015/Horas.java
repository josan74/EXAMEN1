/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_java_2015;

/**
 *
 * @author José Ángel Andrés Castillejo
 */
public class Horas extends Empleado {
    private int horas;
    
    public Horas() {
    }

    public Horas(String dni, String nombre, String apellidos, int horas) {
        super(dni, nombre, apellidos);
        this.horas=horas;
    }

    @Override
    public double sueldo() {
        double sueldo;
        if(horas<160){
            sueldo=horas*8.5;
        }else{
            int extras;
            extras=horas-160;
            sueldo= 160*8.5 + extras*11.5; 
        }
        return sueldo;
    }
    
}
