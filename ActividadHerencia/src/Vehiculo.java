/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Unireformada
 */
public class Vehiculo {
    private String Matricula;
    private String Marca;
    private int Modelo;

    public Vehiculo() {
    }

    public Vehiculo(String Marca) {
        this.Marca = Marca;
    }

    public Vehiculo(String Matricula, String Marca, int Modelo) {
        this.Matricula = Matricula;
        this.Marca = Marca;
        this.Modelo = Modelo;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

   
    
    @Override
public String toString(){
    return  "Vehiculo{" +"Matricula="+ Matricula +",Marca="+Marca+",Modelo="+Modelo+"}";
}
    
}
