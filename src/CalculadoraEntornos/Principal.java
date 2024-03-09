package CalculadoraEntornos;

import java.util.Scanner;

/**
 * @author Samuel Salguero
 */

public class Principal {

    static Scanner sc = new Scanner(System.in);
    static final String PETICION1 = "Introduce un numero";
    static final String PETICION2 = "Introduce otro";
    static final String RESULTADO = " es: ";


    /**
     * En el main de la clase principal crearemos el menú que se debe mostrar
     *y pediremos al usuario que eleja una opción. Si elije una del 1-4 usaremos
     * el objeto Calculadora y ejecuatremos el metodo correspondiente. Si se
     * elige 0 se cerrará el programa mostrando un mensaje de despedida. En cada
     * uno de las opciones del 1-4 le pediremos y usaremos un par de double que
     * serán los número que usaremos para la operación correspondiente.
     */

    public static void main(String[] args) {

        String op;

        do {

            double num1;
            double num2;
            Calculadora cal = new Calculadora();

            System.out.println("La calculadora tiene las siguientes opciones: ");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("0.- Salir");

            op = sc.nextLine();
            System.out.println();

            switch (op) {
                case "1":
                    System.out.println("Sumar");

                    System.out.println(PETICION1);
                    num1 = sc.nextDouble();

                    System.out.println(PETICION2);
                    num2 = sc.nextDouble();

                    System.out.println("La suma de "+num1+" y "+ num2+RESULTADO+cal.sumar(num1, num2));

                    sc.nextLine();
                    System.out.println();

                    break;
                case "2":
                    System.out.println("Restar");

                    System.out.println(PETICION1);
                    num1 = sc.nextDouble();

                    System.out.println(PETICION2);
                    num2 = sc.nextDouble();

                    System.out.println("La resta de "+num1+" y "+ num2+RESULTADO+cal.restar(num1, num2));

                    sc.nextLine();
                    System.out.println();

                    break;
                case "3":
                    System.out.println("Multiplicar");

                    System.out.println(PETICION1);
                    num1 = sc.nextDouble();

                    System.out.println(PETICION2);
                    num2 = sc.nextDouble();

                    System.out.println("La multiplicacion de "+num1+" y "+ num2+RESULTADO+cal.multiplicar(num1, num2));

                    sc.nextLine();
                    System.out.println();

                    break;
                case "4":
                    System.out.println("Dividir");

                    System.out.println(PETICION1);
                    num1 = sc.nextDouble();

                    System.out.println(PETICION2);
                    num2 = sc.nextDouble();

                    System.out.println("La division de "+num1+" y "+ num2+RESULTADO+cal.dividir(num1, num2));

                    sc.nextLine();
                    System.out.println();

                    break;
                case "0":
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    System.out.println();
            }


        } while (!op.equals("0"));

    }
}
