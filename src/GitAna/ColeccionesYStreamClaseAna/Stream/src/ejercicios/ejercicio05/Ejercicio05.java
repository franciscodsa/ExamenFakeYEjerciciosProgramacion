package GitAna.ColeccionesYStreamClaseAna.Stream.src.ejercicios.ejercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ejercicio05 {
    public static void main(String[] args) {
        List<Integer> enteros = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            enteros.add((int) (Math.random() * 41 - 20));
        }
        enteros.sort((n1, n2) -> n1 - n2);
        enteros.forEach(n -> System.out.print(n + " "));
        // a) Crear dos stream, uno con los positivos y otro con los negativos, sin repetir
        System.out.println("\n5.a");
        System.out.print("Positivos: ");
        enteros.stream()
                .filter(n -> n >= 0)
                .distinct()
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\nNegativos:");
        Stream<Integer> negativos = enteros.stream()
                .filter(n -> n < 0)
                .distinct();
        negativos.forEach(n -> System.out.print(n + " "));
        System.out.println("\n\n5.b");
        long numPositivos = enteros.stream()
                .filter(n -> n >= 0).count();
        System.out.println("Total positivos: " + numPositivos);
        long numNegativos = enteros.stream()
                .filter(n -> n < 0).count();
        System.out.println("Total Negativos: " + numNegativos);

        System.out.println("\n5.c");
        long b5 = enteros.stream()
                .filter(n -> n >= -10 && n <= 10)
                .distinct()
                //.forEach(n -> System.out.print(n + " "))
                .count();
        System.out.println(b5);

    }
}
