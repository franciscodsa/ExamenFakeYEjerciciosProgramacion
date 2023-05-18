package GitAna.ColeccionesYStreamClaseAna.Colecciones.ejemploIterador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Socio socio1 = new Socio(3, "Valentin", LocalDate.of(2001, 2, 8));
        Socio socio2 = new Socio(2, "Claudia", LocalDate.of(2002, 10, 16));
        Socio socio3 = new Socio(1, "Javier", LocalDate.of(1996, 10, 14));
        Socio socio4 = new Socio(4, "Victor", LocalDate.of(1991, 5, 10));

        ArrayList<Socio> socios = new ArrayList<>();
        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);

        System.out.println("Según entran en el arraylist:");
        //imprimirSocios(socios);
        // En vez de utilizar foreach o for para recorrer una colección
        // puedo utilizar un ITERATOR
        imprimirConIterador(socios);

        // ordenamos por fecha de nacimiento
        // instanciamos la clase comparadora
        ComparaFNacimiento comparaFNacimiento = new ComparaFNacimiento();
        // y ahora ya podemos ordenar pasando ese objeto al método sort
        socios.sort(comparaFNacimiento);
        System.out.println("\nOrdenados por fecha de nacimiento");
        //imprimirSocios(socios);
        // ordenamos por fecha de nacimiento, al revés
        Comparator comparaFNacimientoDesc = comparaFNacimiento.reversed();
        socios.sort(comparaFNacimientoDesc);
        System.out.println("\nOrdenados por fecha de nacimiento al revés");
        //imprimirSocios(socios);
    }

    static void imprimirSocios(ArrayList<Socio> socios) {
        for (Socio elemento: socios) {
            System.out.println(elemento);
        }
    }

    static void imprimirConIterador(ArrayList<Socio> socios) {
        Iterator<Socio> socioIterator = socios.iterator(); // creo el iterador
        while (socioIterator.hasNext()) { // mientras en la colección socios haya un siguiente elemento
            Socio socio = socioIterator.next(); // "cojo" el socio que está en la siguiente posición
            System.out.println(socio);
        }
    }
}
