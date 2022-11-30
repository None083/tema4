/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package series;

/**
 *
 * @author noelia
 */
public class MisSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Serie simpsons = new Serie("Los Simpsons", "comedia", "", "Disney", 24);
        System.out.println(simpsons);
        
        Serie house = new Serie();
        Serie simpson2 = ServicioSerie.copiar(simpsons);
        System.out.println("Hashcode simpson " + simpsons.hashCode());
        System.out.println("Hashcode simpson2 " + simpson2.hashCode());
        System.out.println("Son iguales Los Simpsons a House?" + simpsons.equals(house));
        System.out.println("Es igual simpson y simpson2?" + simpsons.equals(simpson2));
        System.out.println(house);
        
        Serie prisonBreak = new Serie("Prison Break", "Acción", "...", "AMC", 5, 120000);
        System.out.println(prisonBreak);
        System.out.println("Hashcode Prison break " + prisonBreak.hashCode());
        
        Serie peakyBlinders = ServicioSerie.leerTecladoSerie();
        System.out.println(peakyBlinders);
        
        ServicioSerie.darLike(prisonBreak);
        System.out.println(prisonBreak);
        ServicioSerie.darLike(peakyBlinders);
        System.out.println(peakyBlinders);
        
        
        
    }
    
    
}
