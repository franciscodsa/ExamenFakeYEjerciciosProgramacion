package GitAna.ColeccionesYStreamClaseAna.Colecciones.ejercicios.ejercicio01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // cree un conjunto sin ordenar de
        //12 hoteles. -> Set -- HashSet

        Set<Hotel> hoteles = new HashSet<>();
        hoteles.add(new Hotel(4, "playa", 100));
        hoteles.add(new Hotel(40, "playa", 110));
        hoteles.add(new Hotel(400, "playa", 120));
        hoteles.add(new Hotel(4000, "playa", 130));
        hoteles.add(new Hotel(5, "montaña", 100));
        hoteles.add(new Hotel(50, "montaña", 110));
        hoteles.add(new Hotel(500, "montaña", 120));
        hoteles.add(new Hotel(5000, "rural", 130));
        hoteles.add(new Hotel(6, "rural", 100));
        hoteles.add(new Hotel(60, "rural", 50));
        hoteles.add(new Hotel(600, "rural", 400));
        hoteles.add(new Hotel(6000, "montaña", 130));
        // El programa nos mostrará por consola este conjunto de hoteles
        hoteles.forEach(hotel -> System.out.println(hotel));
        // nos preguntará en qué zona queremos el hotel.
        Scanner sc = new Scanner(System.in);
        System.out.println("¿En qué zona quieres el hotel?");
        String zona = sc.nextLine().toLowerCase(); // zona elegida

        ArrayList<Hotel> elegidos = new ArrayList<>();
        for (Hotel h: hoteles) {
            if (h.getZona().equals(zona)) {
                elegidos.add(h);
            }
        }
        System.out.println("Antes de ordenar por precio");
        elegidos.forEach(h -> System.out.println(h));
        System.out.println();
        elegidos.sort((hotel1, hotel2) -> hotel1.getPrecio() - hotel2.getPrecio());
        System.out.println("Después de ordenar por precio");
        elegidos.forEach(h -> System.out.println(h));

    }
}
        


