/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasecuenta;

/**
 *
 * @author FX506
 */
public class cuentaMain {

    /**
     *  * clase main: creamos un par de objetos y probamos los metodos de
     * CALCULOS CUENTA
     *
     */
    public static void main(String[] args) {

        ClaseCuenta currupepa = new ClaseCuenta("09438979L", "Currupepa", 0.23, 6);
        ClaseCuenta rogelia = new ClaseCuenta("09784515H", "Rogelia", 8000, 2);

        System.out.println("Cuenta de Currupepa: " + currupepa);
        CalculosCuenta.ingresarIntereses(currupepa);
        CalculosCuenta.retirarSaldo(currupepa, 5);
        System.out.println("Actualización de la cuenta de Currupepa: " + currupepa);

        System.out.println("Cuenta de Rogelia: " + rogelia);
        CalculosCuenta.ingresarIntereses(rogelia);
        CalculosCuenta.ingresarSaldo(rogelia, 1000);
        CalculosCuenta.retirarSaldo(rogelia, 500);
        System.out.println("Actualización de la cuenta de Rogelia: " + rogelia);

    }

}
