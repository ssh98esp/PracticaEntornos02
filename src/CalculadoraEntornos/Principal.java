package CalculadoraEntornos;

import java.util.Scanner;

/**
 * @author Samuel Salguero
 */

public class Principal {

    static Scanner sc = new Scanner(System.in);

    /**
     * En el main de la clase principal crearemos el menú que se debe mostrar
     *y pediremos al usuario que eleja una opción. Si elije una del 1-4 crearemos
     * un objeto Calculadora nuevo y ejecuatremos el metodo correspondiente. Si se
     * elige 0 se cerrará el programa mostrando un mensaje de despedida. En cada
     * uno de las opciones del 1-4 le pediremos y crearemos un par de double que
     * serán los número que usaremos para la operación correspondiente.
     */

    public static void main(String[] args) {

        String op;

        do {

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

                    System.out.println("Introduce un numero");
                    double num1 = sc.nextDouble();

                    System.out.println("Introduce otro");
                    double num2 = sc.nextDouble();

                    Calculadora sum = new Calculadora();

                    System.out.println("La suma de "+num1+" y "+ num2+" es: "+sum.sumar(num1, num2));

                    sc.nextLine();
                    System.out.println();

                    break;
                case "2":
                    System.out.println("Restar");

                    System.out.println("Introduce un numero");
                    double num3 = sc.nextDouble();

                    System.out.println("Introduce otro");
                    double num4 = sc.nextDouble();

                    Calculadora res = new Calculadora();

                    System.out.println("La resta de "+num3+" y "+ num4+" es: "+res.restar(num3, num4));

                    sc.nextLine();
                    System.out.println();

                    break;
                case "3":
                    System.out.println("Multiplicar");

                    System.out.println("Introduce un numero");
                    double num5 = sc.nextDouble();

                    System.out.println("Introduce otro");
                    double num6 = sc.nextDouble();

                    Calculadora mul = new Calculadora();

                    System.out.println("La multiplicacion de "+num5+" y "+ num6+" es: "+mul.multiplicar(num5, num6));

                    sc.nextLine();
                    System.out.println();

                    break;
                case "4":
                    System.out.println("Dividir");

                    System.out.println("Introduce un numero");
                    double num7 = sc.nextDouble();

                    System.out.println("Introduce otro");
                    double num8 = sc.nextDouble();

                    Calculadora div = new Calculadora();

                    System.out.println("La division de "+num7+" y "+ num8+" es: "+div.dividir(num7, num8));

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
