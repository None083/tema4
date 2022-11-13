/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajas;

/**
 *
 * @author FX506
 */
public class TestCajaCarton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CajaCarton cajaChica, cajaGrande;
        cajaGrande = new CajaCarton(250, 400, 500, 200);
        cajaChica = new CajaCarton(25, 30, 15, 17);
        System.out.println("Caja grande: Ancho: " +  cajaGrande.getAncho() + "mm");
        System.out.println("Caja grande: Alto: " +  cajaGrande.getAlto() + "mm");
        System.out.println("Caja grande: Largo: " +  cajaGrande.getLargo() + "mm");
        System.out.println("Caja grande: Peso: " +  cajaGrande.getPeso() + "g");
        System.out.println("Caja chica: Peso: " +  cajaChica.getAncho() + "mm");
        System.out.println("Caja chica: Alto: " +  cajaChica.getAlto() + "mm");
        System.out.println("Caja chica: Largo: " +  cajaChica.getLargo() + "mm");
        System.out.println("Caja chica: Peso: " +  cajaChica.getPeso() + "g");
        
        System.out.println(cajaGrande.toString());
        System.out.println(cajaChica.toString());
    }
    
}
