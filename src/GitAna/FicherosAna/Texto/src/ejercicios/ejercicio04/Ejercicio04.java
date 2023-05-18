package GitAna.FicherosAna.Texto.src.ejercicios.ejercicio04;

import java.io.File;
import java.util.Scanner;

/**
 * 4. Crear un programa que borre el fichero cuya ruta ha sido introducida por el usuario.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ruta = sc.nextLine();
        File file = new File(ruta);
        if (file.exists()) { // comprobamos si la ruta al fichero es correcta; también se puede hacer con un try-catch
            // comprobamos si se ha eliminado recogiendo el valor true/false que devuelve el método delete()
            boolean eliminado = file.delete();
            if (eliminado) {
                System.out.println("Fichero eliminado.");
            } else {
                System.out.println("No se ha podido eliminar el fichero.");
            }
        } else {
            System.out.println("Ruta no encontrada");
        }
    }
}


