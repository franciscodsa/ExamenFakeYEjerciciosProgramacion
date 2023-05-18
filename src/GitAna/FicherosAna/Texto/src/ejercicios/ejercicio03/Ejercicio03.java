package GitAna.FicherosAna.Texto.src.ejercicios.ejercicio03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
       // 3. Partiendo del fichero nombres.csv, crear un programa que permita al usuario añadir
        //nombres nuevos a ese fichero.
        // 1) Ruta / nombre del fichero
        String raiz = "Texto\\src\\ejercicios\\ejercicio03\\";
        String nombreFichero = raiz + "nombres.csv";
        // 2) Objeto File
        File file = new File(nombreFichero);
        //System.out.println(file.exists());
        // 3) Queremos escribir -> FileWriter
        FileWriter escritor = null;
        try {
            escritor = new FileWriter(file, true); // true -> porque queremos añadir información al final del fichero
            // ya estoy en condiciones de escribir
            // Pedimos nombre y apellidos, hacemos una línea
            Scanner sc = new Scanner(System.in);
            String nombre = sc.nextLine();
            String apellido1 = sc.nextLine();
            String apellido2 = sc.nextLine();
            String linea = "\n" + nombre + "|" + apellido1 + "|" + apellido2;
            escritor.write(linea);

        } catch (IOException e) {
            //throw new RuntimeException(e);
            System.out.println("Excepción de E/S");
        } finally {
            try {
                escritor.close();
            } catch (IOException e) {
                //throw new RuntimeException(e);
                System.out.println("Error al cerrar el objeto.");
                //e.printStackTrace();
            }
        }

    }
}
