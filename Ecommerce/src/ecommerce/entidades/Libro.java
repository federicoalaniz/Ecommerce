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
public class Libro extends Articulo{
    private String isbn;
    private String editorial;

    public Libro(String isbn, String editorial, String cod, String desc, int cant, double precioB) {
        super(cod, desc, cant, precioB);
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    public double calcularPrecio(){
        double precio = getPrecioB() * 0.8;
        
        return precio;
    }
}
