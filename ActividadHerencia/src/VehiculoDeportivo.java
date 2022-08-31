


public class VehiculoDeportivo extends Vehiculo{
    private int Cilindraje;

    public VehiculoDeportivo(int Cilindraje) {
        this.Cilindraje = Cilindraje;
    }

    public int getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(int Cilindraje) {
        this.Cilindraje = Cilindraje;
    }   
   

    
    @Override
public String toString(){
    return super.toString()+ "VehiculoDeportivo{" +"Cilindraje="+Cilindraje+"}";
}
}
