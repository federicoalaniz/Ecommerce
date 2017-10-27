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
public class Venta {
    private int id;
    private Articulo prod;
    private Cliente cliente;
    private Vendedor vendedor;

    public Venta(int id, Articulo prod, Cliente cliente, Vendedor vendedor) {
        this.id = id;
        this.prod = prod;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Articulo getProd() {
        return prod;
    }

    public void setProd(Articulo prod) {
        this.prod = prod;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    
}
