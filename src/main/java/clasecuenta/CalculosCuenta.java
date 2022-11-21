/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasecuenta;

/**
 *
 * calculos cuenta:
 * -metodos:
 * --ingresar intereses (Cuenta cuenta) aumenta el saldo de la cuenta. saldo=saldo+saldo*interes
 * --ingresar dinero (Cuenta cuenta, double cantidad)
 * --retirar efectivo (Cuenta cuenta, double cantidad) hay que tener en cuenta 
 * que no se puede sacar mas de lo que hay
 * 
 */
public class CalculosCuenta {
    
    public static void ingresarIntereses(ClaseCuenta cuenta){
        
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cuenta.getSaldoActual() * cuenta.getInteres());
        
    }
    
    public static void ingresarSaldo(ClaseCuenta cuenta, double cantidad){
        
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidad);
        
    }
    
    public static boolean retirarSaldo(ClaseCuenta cuenta, double cantidad){
        
        if(cantidad > cuenta.getSaldoActual()){
            return false;
        } else{
            cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
            return true;
        }
        
    }
    
}
