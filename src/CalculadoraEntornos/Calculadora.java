package CalculadoraEntornos;

/**
 * @author Samuel Salguero
 */

public class Calculadora {

    /**
     * El metodo devuelve un double como resultado de la suma de los
     * parámetros que le facilitamos.
     * @param num1 Primer número de la operación
     * @param num2 Segundo número de la operación
     * @return Devuelve el resultado de la operación
     */
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * El metodo devuelve un double como resultado de la resta de los
     * parámetros que le facilitamos.
     * @param num1 Primer número de la operación
     * @param num2 Segundo número de la operación
     * @return Devuelve el resultado de la operación
     */
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * El metodo devuelve un double como resultado de la multiplicación de los
     * parámetros que le facilitamos.
     * @param num1 Primer número de la operación
     * @param num2 Segundo número de la operación
     * @return Devuelve el resultado de la operación
     */
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * El metodo devuelve un double como resultado de la división de los
     * parámetros que le facilitamos.
     * @param num1 Primer número de la operación
     * @param num2 Segundo número de la operación
     * @return Devuelve el resultado de la operación
     */
    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }
}
