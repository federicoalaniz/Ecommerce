/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.entidades;

/**
 *
 * @author Federico Alaniz
 */
public class Electrodomestico extends Articulo {
    private int aGtia;
    private String fabricante;

    public Electrodomestico(int aGtia, String fabricante, String cod, String desc, int cant, double precioB) {
        super(cod, desc, cant, precioB);
        this.aGtia = aGtia;
        this.fabricante = fabricante;
    }

    public int getaGtia() {
        return aGtia;
    }

    public void setaGtia(int aGtia) {
        this.aGtia = aGtia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public double calcularPrecio(){
        double precio = getPrecioB() * 0.85;
        return precio;
    }
}
