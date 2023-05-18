package GitAna.FicherosAna.Texto.src.ejercicios.ejercicio07;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 7. Escribir un programa que lea texto por teclado y lo escriba en un fichero llamado
 * datos.txt. El proceso consiste en leer una línea de texto por teclado y escribirla en el
 * fichero. Este proceso se repite hasta que se introduce por teclado la cadena FIN (da
 * igual que sea en mayúsculas o minúsculas). La cadena FIN que indica el final de lectura
 * no se debe escribir en el fichero.
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        //  primero creamos el fichero
        String raiz = "Texto//src//ejercicios//ejercicio07//";
        String nombreFichero = raiz + "datos.txt";
        File file = new File(nombreFichero);
        // vamos a escribir de forma que se pueda ir añadiendo al final (no sobreescribimos el fichero)
        FileWriter escritor = null;
        Scanner sc = new Scanner(System.in);
        try {
            escritor = new FileWriter(file, true);
            String linea = "";
            do {
                // leemos la línea por teclado
                linea = sc.nextLine();
                // la escribimos en el fichero
                if (!linea.equals("FIN")) {
                    escritor.write(linea + "\n");
                }
            } while (!linea.equals("FIN"));
        } catch (IOException e) {
            //throw new RuntimeException(e);
            System.out.println("Error de E/S");
        } finally {
            try {
                escritor.close();
            } catch (IOException e) {
                //throw new RuntimeException(e);
                System.out.println("Error al cerrar el fichero.");
            }
        }

    }
}
