package GitAna.ColeccionesYStreamClaseAna.Stream.src.ejercicios.ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio02 {
    public static void main(String[] args) {
        List<Personaje> personajes = new ArrayList<>();
        personajes.add(new Personaje("Gandalf", Integer.MAX_VALUE, Arma.BASTÓN, false));
        personajes.add(new Personaje("Aragorn", 88, Arma.ESPADA, true));
        personajes.add(new Personaje("Gimli", 140, Arma.HACHA, false));
        personajes.add(new Personaje("Legolas", 2931, Arma.ARCO, false));
        personajes.add(new Personaje("Boromir", 41, Arma.ESPADA, true));
        personajes.add(new Personaje("Frodo", 51, Arma.ANILLO, false));
        personajes.add(new Personaje("Sam", 33, Arma.ESPADA, false));
        System.out.println("\nJóvenes con espada");
        personajes.stream()
                .filter(personaje -> personaje.getEdad() < 90 && personaje.getArma().equals(Arma.ESPADA))
                .forEach(System.out::println);

        System.out.println("\nPersonajes sin espada");
        personajes.stream()
                .filter(personaje -> !personaje.getArma().equals(Arma.ESPADA))
                .forEach(System.out::println);

        System.out.println("\nOrdenados por nombre");
        personajes.stream()
                .sorted((personaje1, personaje2) -> personaje1.getNombre().compareTo(personaje2.getNombre()))
                .forEach(System.out::println);

        System.out.println("\nPersonajes humanos");
        personajes.stream()
                .filter(personaje -> personaje.isEsHumano())
                .forEach(System.out::println);

        System.out.println("\nPersonaje más viejo");
        personajes.stream()
                .sorted((personaje1, personaje2) -> personaje2.getEdad() - personaje1.getEdad());
        System.out.println(personajes.get(0));
    }
}

