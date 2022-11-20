/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasecuenta;

import org.apache.commons.lang3.RandomStringUtils;

/**clase cuenta:
 * -atributos:
 * --nº cuenta (20 digitos)
 * --nif cliente
 * --nombre cliente
 * --saldo actual
 * --interes % entre 0.1 y 3 (o minimo 0.1)
 * 
 * -metodos:
 * --constructor por defecto. nº cuenta aleatorio
 * --constructor parametrizado. nº cuenta aleatorio
 * --getter y setter. no hay set para el nº cuenta
 * --to string

 * @author noelia
 */
public class ClaseCuenta {
    
    private String numeroCuenta;
    private String NIF;
    private String nombre;
    private double saldoActual;
    private double interes;

    public ClaseCuenta() {
        this.numeroCuenta = numeroCuenta();
    }

    public ClaseCuenta(String NIF, String nombre, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta();
        this.NIF = NIF;
        this.nombre = nombre;
        this.saldoActual = saldoActual;
        if (interes < 0.1){
            this.interes = 0.1;
        } else if (interes > 3){
            this.interes = 3;
        } else {
            this.interes = interes;
        }
        
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNIF() {
        return NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
       

    @Override
    public String toString() {
        return "ClaseCuenta{" + "numeroCuenta=" + numeroCuenta + ", NIF=" + NIF + ", nombre=" + nombre + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }
    
    private static String numeroCuenta() {
        String numero = "";
        for (int i = 0; i < 10; i++) {
            numero = RandomStringUtils.randomNumeric(20);
        }
        return numero; 
    }
    
}


