/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajas;

/**
 *
 * @author FX506
 */
public class CajaCarton {

    private int ancho;
    private int alto;
    private int largo;
    private int peso;

    public CajaCarton(int ancho, int alto, int largo, int peso) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.peso = peso;
    }
    

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    //si se pone static solo se podria usar con la clase cajacarton
    //y no con cajachica o cajagrande
    public void abrir(){
        
    }
    
    public void cerrar(){
        
    }

    @Override
    public String toString() {
        return "CajaCarton{" + "ancho = " + ancho + ", alto = " + alto + ", largo = " + largo + ", peso = " + peso + '}';
    }

    
    
}
