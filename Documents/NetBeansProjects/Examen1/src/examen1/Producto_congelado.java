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
public abstract class Producto_congelado extends Producto {
    
    protected float t_mantenimiento;

    public Producto_congelado() {
        
    }

    public Producto_congelado(String nombre, int cantidad, String num_lote, float t_mantenimiento) {
        super(nombre, cantidad, num_lote);
        this.t_mantenimiento = t_mantenimiento;
        setFecha_caducidad(fecha_envasado);
        setFecha_envasado(fecha_envasado);
        setPais_origen(pais_origen);
    }

    public float getT_mantenimiento() {
        return t_mantenimiento;
    }

    public void setT_mantenimiento(float t_mantenimiento) {
        this.t_mantenimiento = t_mantenimiento;
    }
    
    

    @Override
    public void setPais_origen(String pais_origen) {
        this.pais_origen=pais_origen;
    }

    @Override
    public void setFecha_envasado(Fecha fecha) {
        fecha_envasado=fecha;
    }

    
    @Override
    public void setFecha_caducidad(Fecha fecha) {
        fecha_caducidad=fecha;
    }
    
}
