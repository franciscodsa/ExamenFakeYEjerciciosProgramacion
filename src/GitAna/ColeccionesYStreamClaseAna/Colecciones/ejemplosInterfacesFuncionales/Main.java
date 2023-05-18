package GitAna.ColeccionesYStreamClaseAna.Colecciones.ejemplosInterfacesFuncionales;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> ejemploPredicado = año -> 1991 >= año && año <= 1996;

        // utilizamos el predicado así
        boolean esMillenial = ejemploPredicado.test(1991);
        System.out.println(esMillenial);
        boolean esMillenial2 = ejemploPredicado.test(1997);
        System.out.println(esMillenial2);

        Socio socio1 = new Socio(3, "Valentin", LocalDate.of(2001, 2, 8));
        Socio socio2 = new Socio(2, "Claudia", LocalDate.of(2002, 10, 16));
        Socio socio3 = new Socio(1, "Javier", LocalDate.of(1996, 10, 14));
        Socio socio4 = new Socio(4, "Victor", LocalDate.of(1991, 5, 10));

        ArrayList<Socio> socios = new ArrayList<>();
        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);

        //socios.removeIf(socio -> socio.nombre.startsWith("V"));
        for (Socio socio: socios) {
         //   System.out.println(socio);
        }

        // Function
        Function<Double, Double> cuadrado = numero -> apply(numero);
        System.out.printf("%.2f", cuadrado.apply(2.2));
        System.out.println();
        Function<String, Integer> longitudCadena = cadena -> cadena.length();
        //System.out.println(longitudCadena.apply("Christian"));


        // Consumer
        Consumer<String> consumidor = nombre -> accept(nombre);

        Scanner scanner = new Scanner(System.in);
        //consumidor.accept(scanner.nextLine());

        // impimimos los socios
        socios.forEach(x -> System.out.println(x));

        // Supplier
        Supplier<Integer> numeroAleatorio = () -> (int) (Math.random() * 100) + 1;
        for (int i = 0; i < 5; i++) {
            //System.out.println(numeroAleatorio.get());
        }

    }

    private static void accept(String nombre) {
        System.out.println("Buenas tardes, " + nombre);
    }

    private static Double apply(Double numero) {
        return numero * numero;
    }
}
