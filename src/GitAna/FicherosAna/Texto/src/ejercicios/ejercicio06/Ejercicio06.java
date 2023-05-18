package GitAna.FicherosAna.Texto.src.ejercicios.ejercicio06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 6. Escribir un programa que lea el contenido del fichero br.txt y muestre la información
 * que almacena, de forma que muestre en lineas diferentes los fragmentos separados por
 * un asterisco.
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        // 1) Ruta:
        // 1) Primero tenemos que "leer" el fichero
        String raiz = "Texto//src//ejercicios//ejercicio06//";
        String nombreFichero = raiz + "br.txt";
        File file = new File(nombreFichero);
        Scanner lector = null;
        try {
            lector = new Scanner(file);
            while (lector.hasNext()) {
                String linea = lector.nextLine();
                //System.out.println(linea);
                linea = linea.replace("\n", "*");
                String[] array = linea.split("\\*");
                Arrays.stream(array).forEach(System.out::println);
            }
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("Fichero no encontrado.");
        }
    }
}
