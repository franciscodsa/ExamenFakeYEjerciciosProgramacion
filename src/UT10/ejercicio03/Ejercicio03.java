package UT10.ejercicio03;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio03 {
//    3. Partiendo del fichero nombres.csv, crear un programa que permita al usuario añadir
//    nombres nuevos a ese fichero.
    public static void main(String[] args) {
        try (FileWriter fr = new FileWriter("src/UT10/nombres.csv", true); BufferedWriter escritor = new BufferedWriter(fr); Scanner scanner = new Scanner(System.in)){
            String respuesta= "";
            String nuevoNombre = "";

            do {
                System.out.println("Quieres introducir un nombre? S/N");
                respuesta = scanner.nextLine().toUpperCase();
                if (respuesta.equals("S")){
                    System.out.print("Nombre:");
                    nuevoNombre += "\n" + scanner.nextLine() + "|";
                    System.out.print("Primer apellido:");
                    nuevoNombre += scanner.nextLine() + "|";
                    System.out.print("Segundo apellido:");
                    nuevoNombre += scanner.nextLine();
                    escritor.write(nuevoNombre);
                    nuevoNombre= "";
                }
            }while (!respuesta.equals("N"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
