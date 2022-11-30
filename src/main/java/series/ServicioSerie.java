/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package series;

import java.util.Scanner;

/**
 *
 * Me sirve de conexión entre el main y mi clase Serie
 */
public class ServicioSerie {
    
    private static Scanner teclado = new Scanner(System.in);
    
    // Lee por teclado los datos de una serie y devuelve el objeto creado
    public static Serie leerTecladoSerie(){
        
        // Creamos el objeto de tipo Serie
        Serie serie;
        
        //Leer por teclado e instanciar
        System.out.println("Nombre de la serie: ");
        String nombreSerie = teclado.nextLine();
        System.out.println("Genero de la serie: ");
        String generoSerie = teclado.nextLine();
        System.out.println("Sinopsis de la serie: ");
        String sinopsisSerie = teclado.nextLine();
        System.out.println("Productora de la serie: ");
        String productorSerie = teclado.nextLine();
        System.out.println("Numero de temporadas");
        int temporadas = teclado.nextInt();
        System.out.println("Likes de la serie");
        int likes = teclado.nextInt();
        
        //Instanciamos el objeto
        serie = new Serie(nombreSerie, generoSerie, sinopsisSerie, productorSerie, temporadas, likes);
        
        //Devolvemos el tipo Serie
        return serie;
        
    }
    
    public static void darLike(Serie serie){
        System.out.println("Te ha gustado la serie " + serie.getTitulo() + "?");
        String respuesta = teclado.nextLine();
        if (respuesta.equalsIgnoreCase("si")){
            serie.darLike();
        }
    }
    
    public static Serie copiar( Serie origen){
        Serie aux = new Serie(origen.getTitulo(), origen.getGenero(),
                origen.getSinopsis(), origen.getProductor(), 
                origen.getNumeroTemporadas(), origen.getLikes());
        return aux;
    }
    
}
