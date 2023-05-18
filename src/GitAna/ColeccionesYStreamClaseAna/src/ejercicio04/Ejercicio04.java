package GitAna.ColeccionesYStreamClaseAna.src.ejercicio04;

import java.util.function.Predicate;

public class Ejercicio04 {
    public static void main(String[] args) {
        //4. Con la interfaz Predicate:
        //4.1. Define un predicado para comprobar si un entero es múltiplo de 5.
        Predicate<Integer> predicado1 = n -> n % 5 == 0;
        System.out.println("4.1 " + predicado1.test(23));
        //4.2. Define un predicado para comprobar si un String no termina en “s”.
        Predicate<String> predicado2 = s -> !(s.endsWith("s") || s.endsWith("S"));
        System.out.println("4.2 " + predicado2.test("hola"));
        //4.3. Define un predicado para comprobar si un entero es par y múltiplo de 3.
        Predicate<Integer> predicado3 = n -> n % 2 == 0 && n % 3 == 0;
        System.out.println("4.3 " + predicado3.test(6));
        //4.4. Define un predicado para comprobar si un carácter es una letra y está en mayúscula.
        Predicate<Character> predicado4 = c -> Character.isLetter(c) && Character.isUpperCase(c);
        System.out.println("4.4 " + predicado4.test('C'));
        //4.5. Define un predicado para comprobar si un entero es impar y múltiplo de 7;
        Predicate<Integer> predicado5 = n -> n % 2 != 0 && n % 7 == 0;
        System.out.println("4.5 " + predicado5.test(49));
        //4.6. Define un predicado para comprobar si un entero es impar o múltiplo de 7.
        Predicate<Integer> predicado6 = n -> n % 2 != 0 || n % 7 == 0;
        System.out.println("4.6 " + predicado6.test(11));
    }
}

