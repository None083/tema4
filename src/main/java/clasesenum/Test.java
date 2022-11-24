/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesenum;

/**
 *
 * @author noelia
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EstadoAnimal estadoPerro = EstadoAnimal.COMIENDO;
        System.out.println("Estado perro tiene de código " + estadoPerro.getCodigoEstado());
        System.out.println("Estado perro tiene de descripción " + estadoPerro.getEstado());
        
        
    }
    
}
