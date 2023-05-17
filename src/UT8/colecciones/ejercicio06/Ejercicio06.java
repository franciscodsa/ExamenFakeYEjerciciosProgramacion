package UT8.ejercicio06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        List <Integer> nums = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int num;
        do {
            num = scanner.nextInt();
            if (num > 0) {
                nums.add(num);
            }
        }while (num > 0);

        nums.forEach(n -> System.out.println(n + " "));
        nums.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> {
                    int index = nums.indexOf(n);
                    System.out.println(index * 100);
                });
    }
}
