package UT8.lambda.predicate;

import java.util.function.Predicate;

public class Predicados {

    public static void main(String[] args) {

        // Predicado para comprobar si un entero es múltiplo de 5.
        Predicate<Integer> esMultiploDe5 = numero -> numero % 5 == 0;
        System.out.println("¿15 es múltiplo de 5? " + esMultiploDe5.test(15)); // true

        // Predicado para comprobar si un String no termina en "s".
        Predicate<String> terminaEnS = cadena -> !cadena.endsWith("s");
        System.out.println("¿La palabra 'casa' termina en 's'? " + terminaEnS.test("casa")); // false

        // Predicado para comprobar si un entero es par y múltiplo de 3.
        Predicate<Integer> esParYMúltiploDe3 = numero -> numero % 2 == 0 && numero % 3 == 0;
        System.out.println("¿12 es par y múltiplo de 3? " + esParYMúltiploDe3.test(12)); // true

        // Predicado para comprobar si un carácter es una letra y está en mayúscula.
        Predicate<Character> esLetraMayuscula = caracter -> Character.isLetter(caracter) && Character.isUpperCase(caracter);
        System.out.println("¿El carácter 'A' es una letra en mayúscula? " + esLetraMayuscula.test('A')); // true

        // Predicado para comprobar si un entero es impar y múltiplo de 7.
        Predicate<Integer> esImparYMúltiploDe7 = numero -> numero % 2 != 0 && numero % 7 == 0;
        System.out.println("¿21 es impar y múltiplo de 7? " + esImparYMúltiploDe7.test(21)); // true

        // Predicado para comprobar si un entero es impar o múltiplo de 7.
        Predicate<Integer> esImparOMúltiploDe7 = numero -> numero % 2 != 0 || numero % 7 == 0;
        System.out.println("¿10 es impar o múltiplo de 7? " + esImparOMúltiploDe7.test(10)); // false
    }
}

