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
public class Carrito {
    private int id;
    private Articulo[] prod = new Articulo[100];
    private Cliente cliente;
    private Vendedor vendedor;

    public Carrito(int id, Articulo[] prod, Cliente cliente, Vendedor vendedor) {
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

    public Articulo[] getProd() {
        return prod;
    }

    public void setProd(Articulo[] prod) {
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

    
    
    public void agregaArticulo(Articulo art){
        try{
            int i=0;
            while(prod[i]!= null && i<prod.length){
                i++;
            }
            if(prod[i]==null){
                prod[i]=art;
            }
        }
        catch(Exception ex){
            
        }
    }
    public double getTotalVenta(){
        int i=0;
        double total=0;
        while(prod[i]!= null && i<prod.length){
            total += prod[i].calcularPrecio() * prod[i].getCant();
            i++;
        }
        return total;
    }
    public void listarArticulos(){
        int i=0;
        System.out.println("CODIGO\tDESCRIPCION\tCANTIDAD\tPRECIO\tTOTAL");
        while(prod[i] != null && i < prod.length){
            System.out.println(prod[i].getCod()+ "\t"+prod[i].getDesc()+"\t"+prod[i].getCant()+ "\t"+ prod[i].calcularPrecio()+"\t"+prod[i].getCant()*prod[i].calcularPrecio() );
            i++;
        }
    }
    
}
