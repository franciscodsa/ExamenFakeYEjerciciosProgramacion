package UT10.ejercicio01;

import java.io.File;
import java.util.Scanner;

public class Ejercicio01 {
//    1. Escribir un programa en Java que, para una ruta indicada por el usuario (metida por
//teclado), muestre:
//            • Si el fichero existe o no
//• Si se trata de un directorio o de un fichero
//• En caso de ser un fichero, debe mostrar su nombre, su tamaño y si tiene
//    permisos de lectura, escritura y/o ejecución.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ruta: ");
        String ruta = scanner.nextLine();
        File file = new File(ruta);

        if (file.exists()){
            System.out.println("Si existe");
            if (file.isFile()){
                System.out.println("Es un fichero");
                System.out.println(file.getName());
                System.out.println(file.length() + "bytes");
                System.out.println("Lectura: " + file.canRead());
                System.out.println("Escritura: " + file.canWrite());
                System.out.println("Ejecucuion: "+ file.canExecute());
            } else if (file.isDirectory()) {
                System.out.println("Es un directorio");
            }
        }else {
            System.out.println("no existe");
        }



    }
}
