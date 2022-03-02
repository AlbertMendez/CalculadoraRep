
package com.mycompany.calculadora;

/**
 * Holiwis, Esta clase contendrá los métodos que se encargan de realizar las diferentes operaciones.
 * @author Albertito
 */
public class Operaciones {
    
   
    public Operaciones() {
    };
    
    /**
     * En este apartado se está realizando las operaciones de multiplicación
     * @param val1 - multiplicando.
     * @param val2 - multiplicador.
     * @return Devuelve el producto de val1 por val2.
     */
    public double multiplicar (double val1, double val2) {
        return (val1 * val2);
    }
    
    /**
     * En este método estamos realizando una suma entre los dos valores
     * @param val1 Valor 1 para la suma
     * @param val2 Valor 2 para la suma
     * @return Returna el valor total de la suma
     */
    public double sumar (double val1, double val2) {
        return (val1 + val2);
    }
    
    /**
     * Este método en cuestión lo que hace es dividir entre las dos variables declaradas
     * @param val1 Dividendo
     * @param val2 Divisor
     * @return Devuelve el valor total
     */
    public double dividir (double val1, double val2) {
        if (val2 != 0) 
            return (val1 / val2);
        else
            return (-1);
    }
    
}
