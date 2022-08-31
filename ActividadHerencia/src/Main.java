/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Unireformada
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VehiculoDeportivo  v1 = new   VehiculoDeportivo(5);
       v1.setMarca("vmw");
       v1.setMatricula("12htd");
       v1.setModelo(2022);
        System.out.println(v1);
        
        
       VehiculoFurgoneta f1 = new VehiculoFurgoneta(15);
       
         f1.setMarca("54");
         f1.setMatricula("sf");
         f1.setModelo(2410);
         System.out.println(f1);
         
         VehiculoTurismo t1 = new VehiculoTurismo(12);
         t1.setMarca("jgh");
         t1.setMatricula("gjg");
         t1.setModelo(1420);
         System.out.println(t1);
         
         
          
             }
   
    
}
