/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Unireformada
 */
public class VehiculoTurismo extends Vehiculo{
    private int NumeroPuertas;
    
    public VehiculoTurismo( int NumeroPuertas){
        
        this.NumeroPuertas = NumeroPuertas;
    }

    public int getNumeroPuertas() {
        return NumeroPuertas;
    }

    public void setNumeroPuertas(int NumeroPuertas) {
        this.NumeroPuertas = NumeroPuertas;
    }
     @Override
public String toString(){
    return super.toString()+ "VehiculoTurismo{" +"NumeroPuertas="+NumeroPuertas +"}";
}
         
}
