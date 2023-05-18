package GitAna.ExcepcionesAna.src.ejemplos;

import java.util.Scanner;

public class EjemplosConIf {
    public static void main(String[] args) {
        // arrays -> puedo evitar que salte la excepción con un if
        String[] array = {"uno", "dos", "tres"};
        int posicion= 3;
        if (array.length > posicion) {
            System.out.println(array[posicion]);
        } else {
            System.out.println("Te has salido del array");
        }

        // dividir por 0 --> puedo evitar que salte la excepción con un if
        int numerador = 5;
        int denominador = 0;
        if (denominador != 0) {
            System.out.println(numerador / denominador);
        } else {
            System.out.println("No se puede dividir por 0");
        }

        // no concuerda el tipo de dato con la entrada por teclado
        Scanner sc = new Scanner(System.in);
        //int entero = sc.nextInt();





    }
}
