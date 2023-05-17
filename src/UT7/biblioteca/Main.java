package biblioteca;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<>();
        Libro libro1 = new Libro(001,"Pinocho",1956);
        Libro libro2 = new Libro(002, "Moby Dick", 1880);
        Libro libro3 = new Libro(003, "The Theory of Everything", 2015);

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);


        System.out.println("Antes de prestar ");
        libros.forEach(libro -> System.out.println(libro.toString()));

        libro3.prestar();

        System.out.println("Despues de prestar ");
        libros.forEach(libro -> System.out.println(libro.toString()));

        System.out.println("Numero de libros prestados:");
        System.out.println(cuentaPrestados(libros));

        Revista revista1 = new Revista(004, "Ciencia Moderna", 2022, 25);
        Revista revista2 = new Revista(005, "Motor Trend", 2023, 345);

        ArrayList<Publicacion> publicaciones = new ArrayList<>();
        publicaciones.add(libro1);
        publicaciones.add(libro2);
        publicaciones.add(libro3);
        publicaciones.add(revista1);
        publicaciones.add(revista2);

        System.out.println("Publicaciones antes del 2020: "+ publicacionesAnteriores(publicaciones,2020));

    }

    public static int cuentaPrestados(ArrayList<Libro> libros) {
        int contador = 0;
        for (Libro libro : libros) {
            if (libro.isPrestado()) {
                contador += 1;
            }
        }
        return contador;
    }

    public static int publicacionesAnteriores(ArrayList<Publicacion> publicaciones, int año) {
        int contador = 0;
        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getAñoDePublicacion() < año) {
                contador += 1;
            }
        }
        return contador;
    }
}

