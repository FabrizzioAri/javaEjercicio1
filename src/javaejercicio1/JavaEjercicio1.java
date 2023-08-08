/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio1;

/**
 *
 * @author Fabrizzio
 */
public class JavaEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto pancho= new Producto(1234,"SUPERPANCHO",35,2);
        System.out.println("El codigo de producto es "+ pancho.getCodigo());
        System.out.println("El producto es "+ pancho.getDescripcion());
        System.out.println("El precio es de $"+ pancho.getPrecio());
        System.out.println("El stock es de "+ pancho.getStock());
    }
    
}
