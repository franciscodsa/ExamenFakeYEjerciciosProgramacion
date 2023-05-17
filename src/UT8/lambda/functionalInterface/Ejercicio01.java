package UT8.lambda.ejercicio01;

import java.util.Arrays;

public class Ejercicio01 {
    public static void main(String[] args) {
        DeterminarSigno signo = (num) -> {
            if (num > 0) {
                return 1;
            } else if (num <0) {
                return -1;
            }else {
                return 0;
            }
        };

        System.out.println(signo.determinarSigno(5));

        Print imprimir = (arg) -> "\"" + arg + "\"";

        System.out.println(imprimir.prit("hola"));

        PrimeroYUltimo pyu = (array) -> new int[] {array[0], array[array.length-1]};

        int [] array = {1, 2, 3, 4};

        int [] nArr = pyu.getPimeroYUltimo(array);

        for (int n: nArr) {
            System.out.print(n + " ");
        }

    }
}
