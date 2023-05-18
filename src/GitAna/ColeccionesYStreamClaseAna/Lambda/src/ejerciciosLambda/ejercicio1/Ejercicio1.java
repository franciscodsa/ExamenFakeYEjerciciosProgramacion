package GitAna.ColeccionesYStreamClaseAna.Lambda.src.ejerciciosLambda.ejercicio1;

import java.util.Arrays;

/**
 * 1. Crea una interfaz funcional para cada uno de los siguientes métodos y crea las
 * expresiones lambda correspondientes:
 */

public class Ejercicio1 {
    public static void main(String[] args) {
    // determinar Signo
        // con métodos (pero así no nos lo piden)
//        int resultado = determinarSigno(-30);
//        System.out.println(resultado);
        Signo s = num -> {
            if (num > 0) {
                return 1;
            } else if (num < 0) {
                return -1;
            } else {
                return 0;
            }
        };
        // para utilizar este lambda, llamamos al método con el objeto creado
        System.out.println(s.determinarSigno(30));
    // print
        //System.out.println(print("Hola"));
        Imprimir imprimir = arg -> "\"" +  arg + "\"";
        System.out.println(imprimir.print("Hola"));

    // getPrimeroYUltimo
        //System.out.println(Arrays.toString(getPrimeroYÚltimo(new int[]{-1, 15, 32, 8, -100})));
        DevolverArray devolverArray = array -> new int[]{array[0], array[array.length-1]};
        System.out.println(Arrays.toString(devolverArray.getPrimeroYÚltimo(new int[]{-1, 15, 32, 8, -100})));


    }

    public static int determinarSigno(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }
    public static String print(String arg) {
        return  "\"" +  arg + "\"";
    }
    public static int[] getPrimeroYÚltimo(int[] array) {
        return new int[]{array[0], array[array.length-1]};
    }
}
