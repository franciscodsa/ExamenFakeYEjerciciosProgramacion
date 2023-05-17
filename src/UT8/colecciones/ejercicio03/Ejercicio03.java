package UT8.colecciones.ejercicio03;

import java.util.*;

public class Ejercicio03 {
    public static void main(String[] args) {
        Random random = new Random();

        List <Integer> colecA = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            colecA.add(random.nextInt(((10 - 1) + 1) + 1));
        }
        Collections.sort(colecA);
        colecA.forEach(n -> System.out.print(n + " "));
        Set<Integer> colecB = new HashSet<>(colecA);

        System.out.println();
        colecB.forEach(n -> System.out.print(n + " "));


    }
}
