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
public class Mercadona {

    public static ArrayList<Producto> productos = new ArrayList<>();

    public static void rellenarDatos() {

        for (int i = 0; i < 30; i++) {
            Empleado e = new Empleado();
            e.setNombre("EMPLEADO" + i);
            e.setEdad(18 + i);
        }

        for (int i = 0; i < 11; i++) {
            Bebida b = new Bebida();
            b.setCodigo(i);
            b.setAzucar(4.35 + i);
            b.setFechacaducidad("28 de Noviembre de 2016");
            productos.add(b);

            Bebidaalcohol ba = new Bebidaalcohol();
            ba.setCodigo(i);
            ba.setAzucar(17.2 + i);
            ba.setFechacaducidad("16 de Marzo de 2020");
            ba.setGraduacion(4 + i);
            productos.add(ba);

            Productofresco pf = new Productofresco();
            pf.setFechacaducidad("05 de Noviembre de 2016");
            pf.setTemperatura(8);
            pf.setCodigo(i);
            productos.add(pf);
        }

    }

    public static void mostrarTodosLosProductos() {

        for (int a = 0; a < 11; a++) {
            productos.get(a).mostrar();
        }
    }

    public static void mostrarAzucarTodasLasBebidas() {

        for (int a = 0; a < productos.size(); a++) {
            if (productos.get(a) instanceof Bebida) {
                System.out.println(productos.get(a).getCodigo());

            }
        }
    }
    
    public static void mostrarMediaGraduacionBebidas(){
    
        double media=0;
        double suma=0;
        int elementos=0;
        
            for(int a=0;a<productos.size();a++){
            if(productos.get(a) instanceof Bebidaalcohol){
            
                suma=suma+((Bebidaalcohol)productos.get(a)).getGraduacion();
                elementos++;       
            }         
            }
            System.out.println(suma/elementos);
    
    
    
    }
    
    

    public static void main(String[] args) {

        rellenarDatos();
        //mostrarTodosLosProductos();
        //mostrarAzucarTodasLasBebidas();
        mostrarMediaGraduacionBebidas();
        

    }

}
