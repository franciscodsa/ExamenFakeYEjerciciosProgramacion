package GitAna.ColeccionesYStreamClaseAna.src; /**
 * @author Daniel Martin Corpa
 * 19/4/23
 * 12:26
 * @version version of class
 * @return value to return
 * @throws Errors that throws
 * @since since version
 * @deprecated Method deprecated
 */

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

/**
 * @param
 * @see ""
 *
 */
// 1. Crea una clase denominada Hotel con los atributos idHotel (int), zona(String), y
//precio (int). Los valores para zona podrán ser "playa","montaña" o "rural". El
//precio supondremos que es un dato en euros que podrá tomar valores entre 40
//y 150.
//Crea una clase con el método main donde se cree un conjunto sin ordenar de
//12 hoteles. El programa nos mostrará por consola este conjunto de hoteles y
//nos preguntará en qué zona queremos el hotel.
//Tras ésto el programa creará un conjunto ordenado por precio con los hoteles
//cuya zona corresponda con la zona elegida y los mostrará por consola.

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zona;
        HashSet<Hotel> hotelDisponible = new HashSet<>();
        hotelDisponible.add(new Hotel(50,130,"playa"));
        hotelDisponible.add(new Hotel(100,50,"montaña"));
        hotelDisponible.add(new Hotel(450,41,"rural"));
        hotelDisponible.add(new Hotel(143,130,"playa"));
        hotelDisponible.add(new Hotel(150,80,"playa"));
        hotelDisponible.add(new Hotel(14,300,"montaña"));
        hotelDisponible.add(new Hotel(13,150,"playa"));
        hotelDisponible.add(new Hotel(43,350,"rural"));
        hotelDisponible.add(new Hotel(490,130,"playa"));
        hotelDisponible.add(new Hotel(60,330,"montaña"));
        hotelDisponible.add(new Hotel(10,430,"rural"));
        hotelDisponible.add(new Hotel(135,230,"montaña"));

        System.out.println("Inserta la zona donde quieres el hotel: [playa,montaña,rural]");
        zona = sc.nextLine();

        Set<Hotel> hotelesZonaElegida = new TreeSet<>(Comparator.comparing(Hotel::getPrecio));
        for (Hotel hotelesElegidos : hotelDisponible) {
            if (hotelesElegidos.getZona().equals(zona)) {
                hotelesZonaElegida.add(hotelesElegidos);
            }
        }
        System.out.println("Hoteles en la zona " + zona + " ordenados por precio:");
        for (Hotel eleccionFinal : hotelesZonaElegida) {
            System.out.println(eleccionFinal.getIdHotel() + " - " + eleccionFinal.getZona() + " - " + eleccionFinal.getPrecio() + "€");
        }

    }


}
