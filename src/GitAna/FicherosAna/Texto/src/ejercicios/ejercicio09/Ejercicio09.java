package GitAna.FicherosAna.Texto.src.ejercicios.ejercicio09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Escribir un programa que busque una palabra o un fragmento en un fichero de texto. El
 * programa pedirá que se introduzca una palabra o un texto por teclado y realizará su
 * búsqueda por el archivo. Se mostrará por pantalla el número de línea y el contenido de
 * la línea del fichero que contiene la cadena buscada. Si la cadena buscada aparece en
 * varias líneas se mostrarán todas ellas. Si el fichero no contiene el texto buscado se
 * mostrará un mensaje indicándolo.
 */

public class Ejercicio09 {
    public static void main(String[] args) {
        // pedimos la palabra o el texto a buscar. Ejemplo: "Gosling"
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce texto a buscar: ");
        String texto = sc.nextLine();

        // abrimos el fichero para leerlo
        String raiz = "Texto//src//ejercicios//ejercicio09//";
        String nombreFichero = raiz + "Java.txt";
        File file = new File(nombreFichero);
        Scanner lector = null;
        String linea = "";
        boolean encontrado = false;
        int lineaNumero = 1;
        try {
            lector = new Scanner(file);
            while (lector.hasNext()) {
                linea = lector.nextLine();
                if (linea.contains(texto)) {
                    System.out.println("Linea " + lineaNumero + " - " + linea);
                    encontrado = true;
                }
                lineaNumero++;
            }
            if (!encontrado) {
                System.out.println(texto + " no se encuentra en el fichero");
            }
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("Fichero no encontrado.");
        }

    }
}
