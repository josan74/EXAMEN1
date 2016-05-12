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
public class Producto_congelado_aire extends Producto_congelado{
    private int nitrogeno;
    private int oxigeno;
    private int dioxido_carbono;
    private int vapor;

    public Producto_congelado_aire() {
      
    }

    

    public Producto_congelado_aire(int nitrogeno, int oxigeno, int dioxido_carbono, int vapor, String nombre, int cantidad, String num_lote, float t_mantenimiento) {
        super(nombre, cantidad, num_lote, t_mantenimiento);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxido_carbono = dioxido_carbono;
        this.vapor = vapor;
        setFecha_caducidad(fecha_envasado);
        setFecha_envasado(fecha_envasado);
        setPais_origen(pais_origen);
    }

    public int getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(int nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public int getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(int oxigeno) {
        this.oxigeno = oxigeno;
    }

    public int getDioxido_carbono() {
        return dioxido_carbono;
    }

    public void setDioxido_carbono(int dioxido_carbono) {
        this.dioxido_carbono = dioxido_carbono;
    }

    public int getVapor() {
        return vapor;
    }

    public void setVapor(int vapor) {
        this.vapor = vapor;
    }

    @Override
    public String toString() {
        return "Producto_congelado_aire{" + "nitrogeno=" + nitrogeno + ", oxigeno=" + oxigeno + ", dioxido_carbono=" + dioxido_carbono + ", vapor=" + vapor + '}';
    }


}
