package GitAna.ExcepcionesAna.src.ejercicios.ejercicio03;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        //1. Crea un programa que defina un array de 5 elementos de tipo double,
        double[] array = {1.0, 6.3, 10.0, -34.2, 100.0};
        // pida una posición y un valor
        Scanner sc = new Scanner(System.in);
        System.out.print("Posición (0-4):");
        int posición = 0;
        double valor = 0;
        try {
             posición = sc.nextInt();
            System.out.println("Valor: ");
            valor = sc.nextDouble();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("El valor introducido no es un número.");
        }

        // y asigne el valor a dicha posición.
        try {
            array[posición] = valor;
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Te has salido del array. El valor no se insertará.");
        }
        System.out.println(Arrays.toString(array));
        //2. Captura la excepción para el caso en que el índice se salga de la dimensión del
        //array.
        //3. ¿Qué ocurre si al aceptar la posición introduzco un número con decimales,
        // o en valor un carácter?
        //4. Gestiona las excepciones que salten.
    }
}
