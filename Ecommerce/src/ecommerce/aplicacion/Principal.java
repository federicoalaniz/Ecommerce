/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.aplicacion;
import ecommerce.entidades.*;

/**
 *
 * @author Federico Alaniz
 */
public class Principal {
    public static void main(String[] args){
        Carrito c = new Carrito();
        
        Libro l1 = new Libro("30514256", "Planeta", "1001", "Enciclopedia Animal", 3, 800);
        Dvd d1 = new Dvd("COWBOT BEBOP", "ALGUIEN","5612", "SERIE ANIME COMPLETA", 4, 1100);
        Electrodomestico e1 = new Electrodomestico(2, "SAMSUNG", "7561", "TV SAMSUNG 32", 4, 4200);
        
        Vendedor v1= new  Vendedor(12500, 30478485, "PEREZ", "SUIPACHA 900");
        Cliente c1 = new Cliente("fedealaniz@gmail.com", 32456789, "GUTIERREZ", "MITRE 754");
        try
        {
            c.agregaArticulo(l1);
            c.agregaArticulo(d1);
            c.agregaArticulo(e1);
        }
        catch(NullExcepcion ex)
        {
            ex.printStackTrace();
        }
        c.setVendedor(v1);
        c.setCliente(c1);
        
        c.listarArticulos();
        System.out.println("TOTAL" + c.getTotalVenta());
        
    }
}
