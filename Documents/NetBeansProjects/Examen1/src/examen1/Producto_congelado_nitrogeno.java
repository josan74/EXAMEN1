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
public class Producto_congelado_nitrogeno extends Producto_congelado{
    
    private String metodo;
    private int segundos;

    public Producto_congelado_nitrogeno(String metodo, int segundos) {
       
    }

    public Producto_congelado_nitrogeno(String metodo, int segundos, String nombre, int cantidad, String num_lote, float t_mantenimiento) {
        super(nombre, cantidad, num_lote, t_mantenimiento);
        this.metodo = metodo;
        this.segundos = segundos;
        setFecha_caducidad(fecha_envasado);
        setFecha_envasado(fecha_envasado);
        setPais_origen(pais_origen);
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return "Producto_congelado_nitrogeno{" + "metodo=" + metodo + ", segundos=" + segundos + '}';
    }
    
    
    
}
