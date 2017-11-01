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
public class Dvd extends Articulo implements Detalle{
    private String titulo;
    private String autor;

    public Dvd(String titulo, String autor, String cod, String desc, int cant, double precioB) {
        super(cod, desc, cant, precioB);
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public double calcularPrecio() {
        return getPrecioB();
    }

    @Override
    public void mostrarDetalle() {
        
        System.out.println("COD: "+getCod());
        System.out.println("DESCRIPCION: "+getDesc());
        System.out.println("TIUTLO: "+ getTitulo());
        System.out.println("AUTOR: "+getAutor());
        System.out.println("PRECIO: "+calcularPrecio());
        
    }
    
}
