/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadona;

/**
 *
 * @author usuario
 */
public class Bebidaalcohol extends Bebida{
    
    private double graduacion;
    
    public void mostrar(){
        System.out.println(this.fechacaducidad);
        super.mostrar();
        System.out.println(this.azucar);
        System.out.println(this.graduacion);
        
    }

    public double getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(double graduacion) {
        this.graduacion = graduacion;
    }
    
}
