/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

/**
 *
 * b. es un molde donde vamos a indicar los atributos y metodos de los 
 * objetos que queremos modelar
 * c. es una variable de tipo referencia que contiene los datos de una
 * instancia de una clase. la instancia es
 * d. 
 * e.
 * f. definicion atributos y metodos
 * k. crear un espacio de memoria donde 
 * l. ejecutar el programa
 * 
 * @author noelia
 */
//definicion de la clase vehiculo
public class Vehiculo {
    //atributos
    String matricula;
    String bastidor;
    String marca;
    String modelo;
    String color;
    double tarifa; //precio alquiles día
    boolean disponible; //alquilado o libre
    
    //constructores
    public Vehiculo(String matr, String bas, String mar, String model,
           String col, double tarif, boolean disponi){
        //matricula de este objeto es igual a la matricula parametro
        this.matricula = matr;
        this.bastidor = bas;
        this.marca = mar;
        this.modelo = model;
        this.color = col;
        this.tarifa = tarif;
        this.disponible = disponi;
        
    }
    
    public Vehiculo(){
        
    }
    
    public Vehiculo(String matricula, String color, String bastidor){
        this.matricula = matricula;
        this.color = color;
        this.bastidor = bastidor;
        //el resto de quedan con valores por defecto: 
    }
    
    
    //metodos Get
    public String getMatricula(){
        return this.matricula;
    }
    
    //metodos Set
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    //si le damos click derecho y le damos a insert code podemos
    //crear los metodos automaticamente
    //si le damos a los getter y setter y ncapsular, los atributos se ponen
    //en privado, y ya solo podemos usar getter y setter en el main

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", bastidor=" + bastidor + 
                ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + 
                ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    //constructor copia
    public Vehiculo(Vehiculo origen){
        this.bastidor = origen.bastidor;
        this.color = origen.bastidor;
        this.disponible = origen.disponible;
        this.marca = origen.marca;
        this.matricula = origen.matricula;
        this.modelo = origen.modelo;
        this.tarifa = origen.tarifa;
             
    }
    
    public Vehiculo copiar(){
        Vehiculo aux = new Vehiculo(matricula, bastidor, marca, 
                modelo, color, tarifa, disponible);
        return aux;
    }
    
    public static Vehiculo copiar(Vehiculo origen){
        Vehiculo aux = new Vehiculo(origen.matricula, origen.bastidor, 
                origen.marca, origen.modelo, origen.color, origen.tarifa,
                origen.disponible);
        return aux;
    }

    /**
     * 
     * 
     */
    public static void main(String[] args) {
        
        
        
        
    }
    
}
