package UT8.colecciones.ejercicio04;

import java.util.*;

public class Ejercicio04 {
    public static void main(String[] args) {
        Random random = new Random();

        List <Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numeros.add(random.nextInt((10 - 1) +1 ) +1);
        }

        Collections.sort(numeros);
        numeros.forEach(n -> System.out.print(n + " "));

        Iterator<Integer> iterator = numeros.iterator();

        while (iterator.hasNext()){
            int numero = iterator.next();
            if (numero == 5){
                iterator.remove();
            }
        }

        System.out.println();
        System.out.println();
        numeros.forEach(n -> System.out.print(n + " "));

    }
}
