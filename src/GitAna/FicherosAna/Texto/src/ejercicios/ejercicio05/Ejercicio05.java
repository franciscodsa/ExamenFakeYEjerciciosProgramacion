package GitAna.FicherosAna.Texto.src.ejercicios.ejercicio05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 5. Escribe un programa en Java que encuentre el número más grande en el fichero
 * dataset_91007.txt
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        // 1) Primero tenemos que "leer" el fichero
        String raiz = "Texto//src//ejercicios//ejercicio05//";
        String nombreFichero = raiz + "dataset_91007.txt";
        File file = new File(nombreFichero);
        Scanner lector = null;
        try {
            lector = new Scanner(file);
            while (lector.hasNext()) {
                String linea = lector.nextLine();
                //System.out.println(linea);
                // 2) Ahora hay que procesar el contenido.
                String[] arrayLinea = linea.split(" ");
                //System.out.println(Arrays.toString(arrayLinea));
                // cada elemento es un String del que se puede extraer un número
                // si lo hiciéramos con métodos, tendríamos que hacer algo parecido al ejercicio 5 del tema Estructuras de Control
                // pero lo vamos a hacer con stream:
                int máximo = Arrays.stream(arrayLinea)
                        .mapToInt(n -> Integer.parseInt(n))// con mapToInt convertimos cada String del array en un número entero
                        .max()
                        .getAsInt(); // este método me ha salido en cuanto he puesto el .
                System.out.println("Máximo: " + máximo);


            }
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("Fichero no encontrado.");
        }

    }
}
