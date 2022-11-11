/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * 2. es un molde donde vamos a indicar los atributos y metodos de los 
 * objetos que queremos modelar
 * 3. es una variable de tipo referencia que contiene los datos de una
 * instancia de una clase. la instancia es
 * 4. 
 * 5.
 * 6. definicion atributos y metodos
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
    
    
    

    /**
     * 
     * 
     */
    public static void main(String[] args) {
        
        
        
        
    }
    
}
