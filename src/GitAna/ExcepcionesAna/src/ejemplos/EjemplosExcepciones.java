package GitAna.ExcepcionesAna.src.ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemplosExcepciones {
    public static void main(String[] args) {
        // para gestionar los posibles errores de ejecución:
        // 1) try {} --> aquí metemos el código que puede fallar
        // 2) catch (TipoDeExcepción nombreQueQuieras){} -->
        // cuando salta una excepción, "se viene aquí"
        // lo que pones dentro de las llaves es lo que quieres que haga
        // en caso de que se produzca esa excepción
        // normalmente, un mensaje
        // 3) (Opcional) finally {} --> lo que pongas aquí se ejecuta siempre
        // si no ha saltado ninguna excepción, del try salta a aquí
        // si ha saltado, después del catch sigue por aquí

        // arrays
        String[] array = {"uno", "dos", "tres"};
        try {
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException exception1) {
            // si salta la excepción se creará el objeto exception1
            //System.out.println(exception1.getMessage());
            //exception1.printStackTrace();
            System.out.println("Te has salido del array");
        } catch (Exception e) {
            System.out.println("Excepción inesperada");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Esto se ejecuta sí o sí");
        }

        // dividir por 0
        int numerador = 5;
        int denominador = 0;
        try {
            System.out.println(numerador / denominador);
        } catch (ArithmeticException exception2) {
            System.out.println("No se puede dividir por 0");
        }

        // no concuerda el tipo de dato con la entrada por teclado
        Scanner sc = new Scanner(System.in);
        int entero;
        try {
            System.out.println("Introduce un número: ");
            entero = sc.nextInt();
            System.out.println("Has introducido el número: " + entero);
        } catch (InputMismatchException exception3) {
            System.out.println("Lo que has introducido no es un número.");
        }




    }
}
