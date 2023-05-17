package UT8.ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca numeros positivos enteros, cuando quiera dejar de introduicr numeros introduzaca -1");

        List <Integer> numeros = new ArrayList<>();

        Integer num;
        do {
            num = scanner.nextInt();
            numeros.add(num);
        }while (num != -1);

        numeros.forEach(n -> System.out.print(n + " "));

        System.out.println("Pares");
        numeros.stream().filter(n -> n% 2 == 0).forEach(n -> System.out.print(n + " "));


        System.out.println();
        System.out.println("Sin multiplos de 3");
        numeros.stream().filter(n -> n% 3 != 0).forEach(n -> System.out.print(n + " "));

    }
}
