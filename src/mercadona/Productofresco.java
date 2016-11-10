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
public class Productofresco extends Productocaduca {
    
    private double temperatura;
    
    public void mostrar(){
        System.out.println(this.fechacaducidad);
        super.mostrar();
        System.out.println(this.temperatura);
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    
}
