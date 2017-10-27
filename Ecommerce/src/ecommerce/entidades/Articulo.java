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
public abstract class Articulo {
    private String cod;
    private String desc;
    private int cant;
    private double precioB;

    public Articulo(String cod, String desc, int cant, double precioB) {
        this.cod = cod;
        this.desc = desc;
        this.cant = cant;
        this.precioB = precioB;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrecioB() {
        return precioB;
    }

    public void setPrecioB(double precioB) {
        this.precioB = precioB;
    }
    
    public abstract double calcularPrecio();
    
}
