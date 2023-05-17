package UT8.colecciones.ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        List <Hotel> hoteles = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            int precio = random.nextInt(((450 - 15) + 1) + 15);
            Zona zona = Zona.values()[random.nextInt(3)];
            Hotel hotel = new Hotel(i,zona,precio);
            hoteles.add(hotel);
        }

        hoteles.forEach( hotel -> System.out.println(hotel));

        System.out.println("En que zona quieres el hotel? \n" + " 1.Playa, 2. Montaña, 3. Rural");
        Zona zona = Zona.values()[scanner.nextInt() - 1];

        hoteles.stream().filter(hotel -> hotel.getZona().equals(zona)).sorted((hotel1, hotel2) -> hotel1.getPrecio() - hotel2.getPrecio()).forEach(hotel -> System.out.println(hotel));
    }
}
