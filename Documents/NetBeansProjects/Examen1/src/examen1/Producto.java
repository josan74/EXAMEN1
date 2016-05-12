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
public abstract class Producto {

    private String nombre;
    private int cantidad;
    private String num_lote;
    protected Fecha fecha_caducidad;
    protected Fecha fecha_envasado;
    protected String pais_origen;

    public Producto() {
    }

    public Producto(String nombre, int cantidad, String num_lote) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.num_lote = num_lote;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNum_lote() {
        return num_lote;
    }

    public void setNum_lote(String num_lote) {
        this.num_lote = num_lote;
    }

    public Fecha getFecha_caducidad() {
        return fecha_caducidad;
    }

    public Fecha getFecha_envasado() {
        return fecha_envasado;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public abstract void setPais_origen(String pais_origen);

    public abstract void setFecha_envasado(Fecha fecha);

    public abstract void setFecha_caducidad(Fecha fecha);

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", num_lote=" + num_lote + ", fecha_caducidad=" + fecha_caducidad + ", fecha_envasado=" + fecha_envasado + ", pais_origen=" + pais_origen + '}';
    }

    
}
