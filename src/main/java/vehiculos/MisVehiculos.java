/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class MisVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instancia de la clase scanner, llamada teclado
        Scanner teclado = new Scanner(System.in);
        Vehiculo v1 = new Vehiculo();
        v1.matricula = "1234RRR";
        v1.color = "verde";
        System.out.println("Matricula de v1 " + v1.matricula);
        System.out.println("Modelo de v1 " + v1.modelo);
        
        Vehiculo ferrari = new Vehiculo();
        ferrari.color = "Rosa chicle";
        ferrari.modelo = "testarrosa";
        ferrari.marca = "Ferrari";
        System.out.println("Color del ferrari " + ferrari.color);
        
        //instanciamos una variable vehiculo 
        Vehiculo mercedes = new Vehiculo("1111AAA", "123454321", 
                "Mercedes", "A1", "Negro", 23.5, true);
        
        System.out.println("Mercedes tarifa " + mercedes.tarifa);
        
//        Vehiculo jeep = new Vehiculo("824374hh", "Gris", "fdfdskl");
//        System.out.println("Jeep marca " + jeep.marca);
//        System.out.println("Jeep matricula " + jeep.getMatricula());
//        jeep.setMatricula("0000ZZZ");
//        System.out.println("Jeep matricula " + jeep.getMatricula());
        
        System.out.println(mercedes.toString());//tambien se puede no poner el .toSrting
        
    }
    
}
