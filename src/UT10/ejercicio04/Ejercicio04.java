package UT10.ejercicio04;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio04 {
//    4. Crear un programa que borre el fichero cuya ruta ha sido introducida por el usuario.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file =null;
        try{
            System.out.println("Introduce ruta");
            file = new File(scanner.nextLine());
            if (file.exists()){
                file.delete();
                System.out.println("Se elimino el archivo");
            }else {
                System.out.println("Archivo no existe");
            }
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }finally {
            scanner.close();
        }
    }
}
