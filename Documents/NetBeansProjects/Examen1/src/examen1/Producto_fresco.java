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
public class Producto_fresco extends Producto{

    public Producto_fresco() {
    }

    public Producto_fresco(String nombre, int cantidad, String num_lote) {
        super(nombre, cantidad, num_lote);
        setFecha_envasado(fecha_envasado);
        setPais_origen(pais_origen);
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

    @Override
    public String toString() {
        return "Producto_fresco{" + '}';
    }

   

}
