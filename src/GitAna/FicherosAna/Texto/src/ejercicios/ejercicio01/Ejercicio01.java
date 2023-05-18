package GitAna.FicherosAna.Texto.src.ejercicios.ejercicio01;

import java.io.File;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        // 1. Escribir un programa en Java que, para una ruta indicada por el usuario (metida por
        //teclado),
        Scanner sc = new Scanner(System.in);
        String ruta = sc.nextLine();
        File file = new File(ruta);
        // lo siguiente se resuelve con los métodos de File
        // muestre:
        //• Si el fichero existe o no
        if (file.exists()) {
            System.out.println("En esa ruta hay algo, efectivamente.");
            //• Si se trata de un directorio o de un fichero
            if (file.isDirectory()) {
                System.out.println("Más concretamente, es una carpeta.");
            } else {
                System.out.println("Más concretamente, es un fichero.");
        //• En caso de ser un fichero, debe mostrar su nombre, su tamaño y si tiene
                //permisos de lectura, escritura y/o ejecución
                System.out.println("\tNombre: " + file.getName());
                System.out.println("\tTamaño: " + file.length() + " bytes");
                System.out.print("\tPermisos: ");
                String permisos = "";
                if (file.canRead()) {
                    permisos = "r";
                } else {
                    permisos = "-";
                }
                if (file.canWrite()) {
                    permisos = permisos + "w";
                } else {
                    permisos = permisos + "-";
                }
                if (file.canExecute()) {
                    permisos = permisos + "x";
                } else {
                    permisos = permisos + "-";
                }
                System.out.print(permisos);

            }
        } else {
            System.out.println("El fichero o carpeta no existe en esa ruta.");
        }



    }
}
