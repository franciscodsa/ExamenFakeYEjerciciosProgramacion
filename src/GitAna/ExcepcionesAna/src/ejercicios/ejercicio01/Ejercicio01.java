package GitAna.ExcepcionesAna.src.ejercicios.ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        //1. Escribe el código necesario en main para presentar un menú que elija si la suma
        //va a ser de enteros o con decimales.
        System.out.println("1. Enteros\n 2.Decimales");
        // A continuación pedirá los números por teclado (puedes añadir métodos para esto si quieres).
        Scanner sc = new Scanner(System.in);
        try {
            int opcion = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch (opcion) {
                case 1 -> sumaEnteros(a, b);
                case 2 -> System.out.println("No te va a dejar sumar decimales");
            }
        } catch (InputMismatchException objeto) {
            System.out.println("Lo que has introducido no es un número entero.");
            System.out.println(objeto.getMessage());
        } finally {
            System.out.println("Y esto se va a imprimir siempre.");
        }

        //2. Ejecuta el programa e introduce valores decimales para la suma.
        // sale InputMismatchException
        //3. Captura la excepción, e indica con un mensaje que no es un número entero.
        // try... catch
        //4. Ejecuta el programa e introduce letras para la suma.
        //5. Captura la excepción, e indica con un mensaje que no es un número.
        // salta la misma excepción, así que no hay que hacer nada diferente, con controlar esa excepción basta
        //6. Escribe un mensaje que se muestre siempre al finalizar el try-catch.
    }
    public static int sumaEnteros(int a, int b) {
        System.out.println("Suma de " + a + " + " + b + " = ");
        return a + b;
    }
}
