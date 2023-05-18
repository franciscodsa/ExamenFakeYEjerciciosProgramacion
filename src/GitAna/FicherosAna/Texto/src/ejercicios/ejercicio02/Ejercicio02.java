package GitAna.FicherosAna.Texto.src.ejercicios.ejercicio02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        // 2. Partiendo del fichero Restaurantes.csv, crear un programa de Java que muestre los
        //datos de todos aquellos restaurantes cuyo código postal empiece por 6
        // 1) Ruta / nombre del fichero
        String raíz = "Texto\\src\\ejercicios\\ejercicio02\\";
        String nombreFichero = raíz + "Restaurantes.csv";
        // 2) Objeto File
        File file = new File(nombreFichero);
        System.out.println(file.exists());
        // 3) Queremos leer --> Scanner
        Scanner lector = null;
        try {
            lector = new Scanner(file);
            lector.nextLine(); // saltamos la primera línea
            while (lector.hasNext()) {
                String linea = lector.nextLine();
                //System.out.println(linea);
                //  que muestre los
                //datos de todos aquellos restaurantes cuyo código postal empiece por 6.
                // para coger los campos por separado
                String[] atributos = linea.split(",");
                //System.out.println(Arrays.toString(atributos));
                // atributos[0] -> nombre atributos[1] -> dirección ...
                if (atributos[4].startsWith("6")) {
                    System.out.println(Arrays.toString(atributos));
                }
            }




        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("Archivo no encontrado.");
        } finally {
            lector.close();
        }
    }
}
