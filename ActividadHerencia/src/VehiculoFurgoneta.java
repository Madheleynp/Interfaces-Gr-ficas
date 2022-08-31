/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Unireformada
 */
public class VehiculoFurgoneta extends Vehiculo {
    private int Carga;

    public VehiculoFurgoneta(int Carga) {
        this.Carga = Carga;
    }

    public int getCarga() {
        return Carga;
    }

    public void setCarga(int Carga) {
        this.Carga = Carga;
    }

     @Override
public String toString(){
    return super.toString()+ "VehiculoFugoneta{" +"Carga="+Carga+"}";
}
    }


        
    
    
    

