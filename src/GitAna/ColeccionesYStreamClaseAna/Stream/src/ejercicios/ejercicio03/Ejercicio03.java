package GitAna.ColeccionesYStreamClaseAna.Stream.src.ejercicios.ejercicio03;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        String texto = "Abadejo, Abejaruco, Abeja, Abejorro, Águila, Alacrán, Antílope, Babuino, Bacalao," +
                "Ballena, Barracuda, Bisonte, Búho, Caballo, Cebra, Chimpancé, Ciervo, Conejo, Cotorra," +
                "Coyote, Delfín, Dromedario, Elefante, Erizo, Foca, Gacela, Golondrina, Guepardo," +
                "Halcón, Hiena, Hormiga, Hurón, Iguana, Jabalí, Jirafa, Kiwi, Koala, Lagarto, Lince, Lobo," +
                "Mapache, Medusa, Mosca, Murciélago, Nutria, Ñu, Oso, Oveja, Paloma, Pantera," +
                "Perezoso, Reno, Ruiseñor, Salamandra, Sapo, Serpiente, Tiburón, Tigre, Tortuga," +
                "Urraca, Vaca, Yak, Zorro";
        // quitamos los espacios
        texto = texto.replace(" ", "");
        String[] animales = texto.split(",");
        System.out.println(Arrays.toString(animales));
        System.out.println("5.a");
        comenzarPor(animales);
        System.out.println("\n5.b");
        Optional<String> optional1 = Arrays.stream(animales)
                .sorted((l1, l2) -> l2.length() - l1.length())
                .findFirst();
        if (optional1.isPresent()) {
            System.out.println(optional1.get());
        }
        Optional<String> optional2 = Arrays.stream(animales)
                .sorted((l1, l2) -> l1.length() - l2.length())
                .findFirst();
        if (optional2.isPresent()) {
            System.out.println(optional2.get());
        }
        System.out.println("\n5.c");
        long cuenta = Arrays.stream(animales).count();
        System.out.println(cuenta);




    }

    private static void comenzarPor(String[] animales) {
        Scanner sc = new Scanner(System.in);
        String letra = sc.nextLine();
        Arrays.stream(animales)
                .filter(a -> a.startsWith(letra.toUpperCase()))
                .forEach(a -> System.out.print(a + " "));
    }
}
