package UT10.ejercicio02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio02 {
//    2. Partiendo del fichero Restaurentes.csv, crear un programa de Java que muestre los
//    datos de todos aquellos restaurantes cuyo código postal empiece por 6.
    public static void main(String[] args) {
        try (BufferedReader restaurantes = new BufferedReader(new FileReader("src/UT10/Restaurantes.csv"))){
            String linea = restaurantes.readLine();
            while (linea!= null){
                linea = restaurantes.readLine();
                if (linea!=null){
                    String [] restaurante = linea.split(",");
                    if (restaurante[restaurante.length-1].startsWith("6")){
                        System.out.println(linea);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
