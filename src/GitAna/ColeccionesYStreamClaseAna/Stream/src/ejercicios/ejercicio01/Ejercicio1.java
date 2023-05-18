package GitAna.ColeccionesYStreamClaseAna.Stream.src.ejercicios.ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * 15 + 1));
        }
        // con streams
//        a. Imprime todos los elementos de la lista, sin ordenar.
        System.out.println("1.a");
        lista.stream()
                .forEach(numero -> System.out.print(numero + " "));

//        b. Imprime todos los elementos de la lista, ordenados.
        System.out.println("\n\n1.b");
        lista.stream()
                .sorted() // los ordeno
                .forEach(numero -> System.out.print(numero + " ")); // los imprimo

//        c. Imprime todos los elementos de la lista, sin repetir, ordenados.
        System.out.println("\n\n1.c");
        lista.stream()
                .distinct() // cojo solamente los que son distintos entre sí
                .sorted()
                .forEach(numero -> System.out.print(numero + " "));

//        d. Imprime sólo los mayores o iguales a 5.
        System.out.println("\n\n1.d");
        lista.stream()
                .filter(n -> n >= 5)
                .forEach(numero -> System.out.print(numero + " "));
//        e. Imprime sólo los mayores o iguales a 5, ordenados.
        System.out.println("\n\n1.e");
        lista.stream()
                .filter(n -> n >= 5)
                .sorted()
                .forEach(numero -> System.out.print(numero + " "));

//        f. Imprime sólo los mayuores o iguales a 5, ordenados inversamente.
        System.out.println("\n\n1.f");
        // ¡NEW! ORDENAR INVERSAMENTE UN STREAM
        lista.stream()
                .filter(n -> n >= 5)
                .sorted((n1, n2) -> n2 - n1) // esto es para ordenar números inversamente
                .forEach(numero -> System.out.print(numero + " "));

//        g. Suma todos los elementos de la lista.
        int suma = lista.stream()
                .reduce(0, (n1, n2) -> n1 + n2);
        System.out.println(suma);
//        h. Suma todos los elementos mayores o iguales a 5.
//        i. Calcula el promedio de todos los elementos de la lista.
    }
}
