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
 * 
 * calculos cuenta:
 * -metodos:
 * --ingresar intereses (cuenta cuenta) aumenta el saldo de la cuenta. saldo=saldo+saldo*interes
 * --ingresar dinero (cuenta cuenta, double cantidad)
 * --retirar efectivo (cuenta cuenta, double cantidad) hay que tener en cuenta 
 * que no se puede sacar mas de lo que hay
 * 
 * clase main:
 * creamos un par de objetos y probamos los metodos de CALCULOS CUENTA
 *
 * @author noelia
 */
public class ClaseCuenta {
    
    String numeroCuenta;
    String NIF;
    String nombre;
    int saldoActual;
    double interes;

    public ClaseCuenta() {
        this.numeroCuenta = numeroCuenta();
    }

    public ClaseCuenta(String numeroCuenta, String NIF, String nombre, int saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta();
        this.NIF = NIF;
        this.nombre = nombre;
        this.saldoActual = saldoActual;
        this.interes = interes;
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

    public int getSaldoActual() {
        return saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
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


