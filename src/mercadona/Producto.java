/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadona;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Producto {
    
    private String nombre;
    private double peso;    
    private int codigo;
    private static ArrayList <Producto> productos= new ArrayList <>();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void mostrar(){
        System.out.println(this.codigo);
    }

    public static ArrayList<Producto> getProductos() {
        return productos;
    }

    public static void setProductos(ArrayList<Producto> productos) {
        Producto.productos = productos;
    }
    
}
