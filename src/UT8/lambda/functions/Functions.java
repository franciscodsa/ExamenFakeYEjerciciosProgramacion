package UT8.lambda.functions;

import java.util.function.Function;

public class Functions {

    // Función que devuelve la longitud de un String
    public static Function<String, Integer> longitudString = str -> str.length();

    // Función que devuelve el cuadrado de un entero
    public static Function<Integer, Integer> cuadradoEntero = num -> num * num;

    // Función que devuelve el 10% de una cantidad
    public static Function<Double, Double> porcentaje = num -> num * 0.1;

    public static void main(String[] args) {
        // Ejemplos de uso de las funciones
        String palabra = "Hola";
        System.out.println("Longitud de la palabra " + palabra + ": " + longitudString.apply(palabra));

        int num = 5;
        System.out.println("Cuadrado de " + num + ": " + cuadradoEntero.apply(num));

        double cantidad = 100.0;
        System.out.println("10% de " + cantidad + ": " + porcentaje.apply(cantidad));
    }
}
