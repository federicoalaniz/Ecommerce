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
public class Registros {
    private Venta[] lista = new Venta[100];

    public Registros() {
    }
    
    public void agregaArticulo(Articulo art){
        // tengo que chequear este procedimiento
        int i=0;
        while(i<lista.length && lista[i]!= null){
            i++;
        }
        if(lista[i]==null){
            //lista[i] = art;
        }
    }
}
