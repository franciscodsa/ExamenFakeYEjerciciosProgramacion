package UT8.ejercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Double> pos = new ArrayList<>();
        List <Double> nega = new ArrayList<>();

        System.out.println("Introduce 0 si quieres dejar de introducir numeros reales");
        double num;
        do {
            num = scanner.nextDouble();
            if ((num > 0)) {
                pos.add(num);
            } else if (num < 0){
                nega.add(num);
            }

        }while (num != 0);

        System.out.println("Pos");
        pos.forEach(n -> System.out.print(n + " "));
        System.out.println();
        Optional<Double> sumPos = pos.stream().reduce((a, b) -> a + b);
        if (sumPos.isPresent()){
            System.out.println(sumPos.get());
        }


        System.out.println();
        System.out.println("Nega");
        nega.forEach(n -> System.out.print(n + " "));
        System.out.println();
        Optional<Double> negPos = pos.stream().reduce((a, b) -> a + b);
        if (negPos.isPresent()){
            System.out.println(negPos.get());
        }

        pos.removeIf(n -> n > 10);
        nega.removeIf(n -> n < -10);
        System.out.println("Pos");
        pos.forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println("Nega");
        nega.forEach(n -> System.out.print(n + " "));



    }
}
