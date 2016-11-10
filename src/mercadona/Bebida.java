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
public class Bebida  extends Productocaduca{
    
    protected double azucar;
    
    public void mostrar(){
        System.out.println(this.fechacaducidad);
        super.mostrar();
        System.out.println(this.azucar);
    }

    public double getAzucar() {
        return azucar;
    }

    public void setAzucar(double azucar) {
        this.azucar = azucar;
    }
    
}
