package GitAna.ColeccionesYStreamClaseAna.Colecciones.ejercicios.ejercicio06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
//        6. Crear una lista de números enteros positivos introducidos por consola hasta
//        que se introduzca uno negativo.
        List<Integer> enteros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        do {
            numero = sc.nextInt();
            if (numero >= 0) {
                enteros.add(numero);
            }
        } while (numero >= 0);
        enteros.forEach(n -> System.out.print(n + " "));
        System.out.println("Índice de los elementos pares");
//        A continuación, recorrer la lista y mostrar por pantalla los índices
//        de los elementos de valor par, que será multiplicado por 100.
        System.out.println("Índice de los elementos pares multiplicado por 100");
        for (int i = 0; i < enteros.size(); i++) {
            if (enteros.get(i) % 2 == 0) {
                // imprimimos no el elemento, sino el índice
                System.out.print(i * 100 + " ");
            }
        }


    }
}
