/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author Jose Angel
 */
public class Producto_congelado_agua extends Producto_congelado{
    
    private int salinidad;

    public Producto_congelado_agua() {
        
    }

    public Producto_congelado_agua(int salinidad, String nombre, int cantidad, String num_lote, float t_mantenimiento) {
        super(nombre, cantidad, num_lote, t_mantenimiento);
        this.salinidad = salinidad;
        setFecha_caducidad(fecha_envasado);
        setFecha_envasado(fecha_envasado);
        setPais_origen(pais_origen);
    }

    public int getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(int salinidad) {
        this.salinidad = salinidad;
    }

    @Override
    public String toString() {
        return "Producto_congelado_agua{" + "salinidad=" + salinidad + '}';
    }
    
}
