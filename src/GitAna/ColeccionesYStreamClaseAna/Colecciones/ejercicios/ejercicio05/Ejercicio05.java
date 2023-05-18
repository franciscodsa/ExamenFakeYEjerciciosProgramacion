package GitAna.ColeccionesYStreamClaseAna.Colecciones.ejercicios.ejercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        // Implementa una aplicación donde se piden por consola números reales hasta
        //que se introduce un 0.
        // A medida que se leen del teclado, los valores positivos se
        //insertan en una colección y los negativos en otra.
        Scanner sc = new Scanner(System.in);
        List<Double> positivos = new ArrayList<>();
        List<Double> negativos = new ArrayList<>();

        double número = 0;
        do {
            System.out.print("Número: ");
            número = sc.nextDouble();
            if ( número != 0) {
                if (número > 0) {
                    positivos.add(número);
                } else {
                    negativos.add(número);
                }
            }
        } while (número != 0);
        System.out.print("Positivos : ");
        positivos.forEach(n -> System.out.print(n + " "));
        // y las sumas de los elementos de cada una de ellas.
//        double suma = 0;
//        for (double elemento: positivos) {
//            suma = suma + elemento;
//        }
        // lo vamos a hacer de otra forma: con el método reduce de stream
        double sumaP = positivos.stream()
                        .reduce(0.0, (a, b) -> a + b); // forma de sumar todos los elementos de una colección
        System.out.println("Suma de positivos = " + sumaP);

        System.out.println();
        System.out.print("Negativos : ");
        negativos.forEach(n -> System.out.print(n + " "));
        double sumaN = negativos.stream()
                .reduce(0.0, (a, b) -> a + b); // forma de sumar todos los elementos de una colección
        System.out.println("Suma de negativos = " + sumaN);

        // Por último, se
        //eliminan de ambas todos los valores que sean mayores que 10 o menores de -
        //10 y se vuelven a mostrar.
        positivos.removeIf(n -> n > 10);
        System.out.println("");
        positivos.forEach(n -> System.out.print(n + " "));
        negativos.removeIf(n -> n < -10);
        negativos.forEach(n -> System.out.print(n + " "));

    }
}
